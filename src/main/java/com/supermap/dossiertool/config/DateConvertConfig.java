package com.supermap.dossiertool.config;

import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xiangXX
 * @Description: 日期转换器
 * @Date Created in 16:59 2018/12/27 0027
 */
@Component
public class DateConvertConfig implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (source.isEmpty()) {
            return null;
        }
        if (source.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")){
            try {
                return simpleDateFormat.parse(source);
            } catch (ParseException e) {
                return null;
            }
        }
        return null;
    }
}
