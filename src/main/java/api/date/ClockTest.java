/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/13 8:22
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ClockTest {

    private static final Logger log = LogManager.getLogger(ClockTest.class.getName());
    
    public static void main(String[] args) {
        //Clock：该类用于获取指定时区的当前日期、时间。该类可取代System类的currentTimeMillis()方法，
        // 而且提供了更多的方法来获取当前日期、时间。该类提供了大量的静态方法来获取对象。
        Clock clock = Clock.systemUTC();
        log.info("当前时刻：{}", clock.instant());
        ////获取Clock对应的毫秒数，与System.currentTimeMillis()输出相同
        log.info(clock.millis());
        log.info(System.currentTimeMillis());

        //Duration：该类代表持续时间，可以非常方便的获取一段时间(最大单位是Day)。


        Duration duration = Duration.ofSeconds(10000);
        log.info("10000s = {} min",duration.toMinutes());

        log.info("10000s = {} h",duration.toHours());

        log.info("10000s = {} day",duration.toDays());



        Clock clock2 = Clock.systemUTC();
        //在clock基础上增加10000s
        Clock clock3 = Clock.offset(clock,duration);
        log.info(clock2.instant());
        log.info(clock3.instant());

        log.info("=================");

        //Instant：代表一个具体时刻，可以精确到纳秒。
        // 该类提供了静态的now()方法来获取当前时刻，也提供了静态的now(Clock clock)方法来获取clock对应的时刻。
        // 还有minusXxx()和plusXxx()在当前时刻基础上加上一段时间(Duration)
        Instant instant = Instant.now();
        log.info(instant);
        //增加10000秒
        instant = instant.plusSeconds(10000);
        log.info(instant);

        //根据字符串解析Instant对象
        Instant instant1 = Instant.parse("2019-01-01T00:00:00.00Z");
        //最后必须加个z,“Z”是世界时间中0时区的标志 UTC时间
        log.info(instant1);
        instant1 = instant.plus(Duration.ofHours(3).plusMinutes(15));
        log.info(instant1);
    }
}
