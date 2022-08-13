/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sort.InsertSort;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/13 11:17
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class DateNotes {
    //MonthDay：该类代表月日，例如：--03-15，该类提供了静态的now()方法来获取当前月日，也提供了静态的now(Clock clock)方法获取clock对应的月日。
    //
    //YearMonth：该类代表年月，例如：2020-03，该类提供了静态的now()方法来获取当前年月，也提供了静态的now(Clock clock)方法来获取clock对应的月日。minusXxx(),plusXxx()方法减去或加上几年、几月。
    //
    //Year：该类仅代表年，例如：2020，该类提供了静态的now()方法来获取当前年份，也提供了静态的now(Clock clock)方法来获取clock对应的年份。除此之外，还有minusYears()、plusYears()方法在当前的年份上减去或加上几年。
    //
    //Month：这是一个枚举类，定义了一月到十二月的枚举值。
    //
    //DayOfWeek：这是一个枚举类，定义了周日到周六的枚举值。
    //
    //ZoneDateTime：该类代表一个时区化的日期、时间。
    //
    //ZoneId：该类代表一个时区。

    private static final Logger log = LogManager.getLogger(DateNotes.class.getName());

    public static void main(String[] args) {
        log.info("hello world");
    }
}
