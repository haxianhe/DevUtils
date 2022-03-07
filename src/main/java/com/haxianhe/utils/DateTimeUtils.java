package com.haxianhe.utils;

import static java.time.Instant.ofEpochMilli;
import static java.time.ZoneId.systemDefault;
import static java.time.format.DateTimeFormatter.ofPattern;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author haxianhe haxianhe@kuaishou.com
 * Created on 2022-02-17
 */
public class DateTimeUtils {

    private static final Logger logger = LoggerFactory.getLogger(DateTimeUtils.class);

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter FORMATTER_TIME = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final String NORMAL_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final DateTimeFormatter NORMAL_DATE_TIME = ofPattern(NORMAL_DATE_TIME_PATTERN);


    /**
     * 时间戳转字符串时间
     */
    public static String epochMilli2Str(long epochMilli, String pattern) {
        return LocalDateTime.ofInstant(ofEpochMilli(epochMilli), systemDefault())
                .format(ofPattern(pattern));
    }

    /**
     * 字符串时间转时间戳
     */
    public static long str2EpochMilli(String timeString, String pattern) {
        return LocalDateTime.parse(timeString, ofPattern(pattern)).atZone(systemDefault())
                .toInstant().toEpochMilli();
    }

    /**
     *  当前的时间，HH:mm:ss
     */
    public static String currentTime() {
        logger.info("调用方法: {}", "currentTime");
        return LocalTime.now().format(FORMATTER_TIME);
    }

    /**
     *  当前时间，秒
     */
    public static long currentTimeSecond() {
        return LocalTime.now().toSecondOfDay();
    }

    /**
     *  convert time to second.
     */
    public static long convertTimeToSecond(String time) {
        return LocalTime.parse(time).toSecondOfDay();
    }
}
