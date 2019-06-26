package com.letinvr.common.converter;

import com.letinvr.common.util.DateUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Date;
/**
 * 全局的日期转换器
 * **/
@Component
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        return DateUtils.autoParseDate(s);
    }
}
