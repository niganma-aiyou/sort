/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/13 10:39
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class LocalDateTest {

    private static final Logger log = LogManager.getLogger(LocalDateTest.class.getName());

    public static void main(String[] args) {
        //LocalDate：该类代表不带时区的日期，例如：2012-01-01，
        // 该类提供了静态的now()方法来获取当前日期，
        // 也提供了静态的now(Clock clock)方法获取clock对应的日期。
        // 还有minusXxx()和plusXxx()在当前年份基础上减去或加上几年、几月、几周或几日。
        LocalDate localDate = LocalDate.now();
        log.info(localDate);

        //获取2014年的第146天
        localDate = LocalDate.ofYearDay(2014,146);
        log.info(localDate);

        //设置为2014年的5月21日
        localDate = LocalDate.of(2014, Month.MAY,21);
        log.info(localDate);

        //加上一周
        localDate = localDate.plusWeeks(1);
        log.info(localDate);

        //变成3月
        localDate = localDate.withMonth(3);
        log.info(localDate);

        //取本月最后一天
        localDate = localDate.with(TemporalAdjusters.lastDayOfMonth());
        log.info(localDate);
    }
}
