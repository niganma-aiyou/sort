/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sort.InsertSort;

import java.time.LocalTime;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/13 10:51
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class LocalTimeTest {

    private static final Logger log = LogManager.getLogger(LocalTimeTest.class.getName());

    public static void main(String[] args) {
        //LocalTime：该类代表不带时区的时间，
        // 例如：08:57:02，该类提供了静态的now()方法来获取当前时间，
        // 也提供了静态的now(Clock clock)方法获取clock对应的时间。
        // 还有minusXxx()和plusXxx()在当前年份基础上减去或加上几小时、几分、几秒。

        LocalTime localTime = LocalTime.now();
        log.info("现在的时间是：{}",localTime);

        //设置为早上7点0分0秒0纳秒
        localTime = LocalTime.of(7,0,0,0);
        log.info(localTime);

        //返回一天中的第6000秒
        localTime = LocalTime.ofSecondOfDay(6000);
        log.info("一天中的第6000秒对应的时间是：{}" , localTime);
    }
}
