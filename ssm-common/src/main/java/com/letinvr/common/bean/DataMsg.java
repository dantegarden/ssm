package com.letinvr.common.bean;

import com.letinvr.common.util.FastJsonUtils;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class DataMsg {
    private Integer page;
    private Integer size;
    private Map<String,Object> queryCondition;

    public static DataMsg getInstance(Map<String,Object> dataMsgMap){
        DataMsg dataMsg = new DataMsg();
        dataMsg.setPage(Integer.parseInt((String)dataMsgMap.get("page")));
        dataMsg.setSize(Integer.parseInt((String)dataMsgMap.get("size")));
        dataMsg.setQueryCondition(FastJsonUtils.stringToMap((String)dataMsgMap.get("queryCondition")));
        return dataMsg;
    }
}
