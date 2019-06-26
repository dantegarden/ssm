package com.letinvr.dao.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Date;

public class MyMetaObjectHandler implements MetaObjectHandler {

    private final static Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        for(String field: Arrays.asList("createTime","updateTime")){
            Object fieldType = getFieldValByName(field, metaObject);
            if (fieldType == null) {
                setFieldValByName(field, new Date(), metaObject);
            }
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Object fieldType = getFieldValByName("updateTime", metaObject);
        if (fieldType == null) {
            setFieldValByName("updateTime", new Date(), metaObject);
        }
    }
}
