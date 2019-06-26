package com.letinvr.common.bean;

import com.letinvr.common.util.CommonHelper;
import com.letinvr.common.util.FastJsonUtils;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class DataMsg<T> {
    private Integer page;
    private Integer size;
    private String order;
    private Boolean isAsc;

    private T queryCondition;

    public static DataMsg getInstance(Map<String,Object> dataMsgMap){
        DataMsg dataMsg = new DataMsg();
        dataMsg.setPage(Integer.parseInt((String)dataMsgMap.get("page")));
        dataMsg.setSize(Integer.parseInt((String)dataMsgMap.get("size")));
        if(dataMsgMap.containsKey("order")){
            dataMsg.setOrder(CommonHelper.camelToUnderline((String)dataMsgMap.get("order")));
            dataMsg.setIsAsc(Boolean.valueOf((String)dataMsgMap.get("isAsc")));
        }

        dataMsg.setQueryCondition((Map)FastJsonUtils.stringToMap((String)dataMsgMap.get("queryCondition")));
        return dataMsg;
    }

    public static DataMsg getInstance(Map<String,Object> dataMsgMap, Class beanClass){
        DataMsg dataMsg = new DataMsg();
        dataMsg.setPage(Integer.parseInt((String)dataMsgMap.get("page")));
        dataMsg.setSize(Integer.parseInt((String)dataMsgMap.get("size")));
        if(dataMsgMap.containsKey("order")){
            dataMsg.setOrder(CommonHelper.camelToUnderline((String)dataMsgMap.get("order")));
            dataMsg.setIsAsc(Boolean.valueOf((String)dataMsgMap.get("isAsc")));
        }

        dataMsg.setQueryCondition(FastJsonUtils.toBean((String)dataMsgMap.get("queryCondition"), beanClass));
        return dataMsg;
    }
}
