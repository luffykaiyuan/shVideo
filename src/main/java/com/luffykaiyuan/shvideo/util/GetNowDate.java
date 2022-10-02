package com.luffykaiyuan.shvideo.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 获取当前时间
 * @author luffykaiyuan
 * @date 2020/11/22 11:24
 * @return
 */
public class GetNowDate {
    //获取字符串类型的天
    public static String getStringDay() {
        Date date = new Date();
        SimpleDateFormat sdf
                = new SimpleDateFormat("dd");
        return sdf.format(date);
    }
    //获取字符串类型的当前时间
    public static String getStringDate() {
        Date date = new Date();
        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    //获取字符串类型的当前时间
    public static String getDetailStringDate() {
        Date date = new Date();
        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    //获取时间类型的  当前时间
    public static Date getDate() {
        Date date = new Date();
        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(sdf.format(date));
            return date;
        } catch (Exception e) {
            return date;
        }
    }

    public static String getFetureDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + past);
        Date today = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String result = format.format(today);
        return result;
    }
}