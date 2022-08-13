/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/13 11:06
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class LocalDateTimeTest {

    private static final Logger log = LogManager.getLogger(LocalDateTimeTest.class.getName());

    public static void main(String[] args) {
        //LocalDateTime：该类代表不带时区的日期、时间，例如：2012-03-12T08:33:21。
        // 该类提供了静态的now()方法来获取当前日期、时间，也提供了静态的now(Clock clock)方法获取clock对应的日期、时间。
        // 还有minusXxx()和plusXxx()在当前日期、时间基础上减去或加上几年、几月、几周、几日、几小时、几分、几秒、几纳秒。
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info(localDateTime);
        //当前日期、时间加上24小时30分钟
        localDateTime = localDateTime.plusHours(24).plusMinutes(30);
        log.info(localDateTime);
    }
}
