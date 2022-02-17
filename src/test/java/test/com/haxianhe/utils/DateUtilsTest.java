package test.com.haxianhe.utils;

import org.junit.Test;

import com.haxianhe.utils.DateUtils;

/**
 * @author haxianhe <haxianhe@kuaishou.com>
 * Created on 2022-02-17
 */

public class DateUtilsTest {
    @Test
    public void getDayOfWeekTest() {
        System.out.println("今天是周 " + DateUtils.getDayOfWeek());
    }
}
