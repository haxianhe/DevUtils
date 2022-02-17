package com.haxianhe.utils;

import java.time.LocalDateTime;

/**
 * @author haxianhe <haxianhe@kuaishou.com>
 * Created on 2022-02-17
 */
public class DateUtils {
    public static int getDayOfWeek() {
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.getDayOfWeek().getValue();
    }
}
