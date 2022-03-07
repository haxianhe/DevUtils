package test.com.haxianhe.utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haxianhe.utils.DateTimeUtils;

/**
 * @author haxianhe <haxianhe@kuaishou.com>
 * Created on 2022-02-17
 */

public class DateUtilsTest {
    private static final Logger logger = LoggerFactory.getLogger(DateUtilsTest.class);

    @Test
    public void getDayOfWeekTest() {
        System.out.println("当前时间 " + DateTimeUtils.currentTime());
        logger.info("周{}", "一");
    }
}
