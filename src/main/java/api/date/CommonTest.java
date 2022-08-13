/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/12 17:02
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class CommonTest {

    private static final Logger log = LogManager.getLogger(CommonTest.class.getName());

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 从calendar中取date
        Date date = calendar.getTime();
        Calendar calendar1 = Calendar.getInstance();
        //通过date获取calendar
        calendar1.setTime(date);

        //提供了 add 和 roll 方法来进行日期的运算(PS：Calendar中，月份起始值是0)：
        Calendar c = Calendar.getInstance();
        //add(int field,int amount)方法十分强大，当被修改的字段超出它允许的范围时，会发生进位，即上一级字段也发生改变
        // 如果下一级字段会改变，那么字段就会修正到变化最小的值：2020-01-31 加1个月--> 2020-02-29 而不是 2020-03-02

        //当前月份往后推六个月
        c.add(Calendar.MONTH,6);

        //再往前推五个月
        c.add(Calendar.MONTH,-5);
        log.info(c.getTime());

        //当被修改的字段超出它的允许范围时，上一级字段不会变化：2020-01-31 加10天--> 2020-01-10
        // 如果下一级字段会改变，处理规则和add()相似：2020-01-31 加1个月--> 2020-02-29 而不是 2020-03-02
        c.roll(Calendar.MONTH,2);
        c.roll(Calendar.MONTH,-1);
        log.info(c.getTime());

        Calendar calendar2 = Calendar.getInstance();

        //默认Calendar的容错性是true，MONTH字段设置为13，将会导致YEAR字段加1
        calendar2.set(Calendar.MONTH,11);

        //关闭容错性
        //calendar2.setLenient(false);
        //会引发异常 java.lang.IllegalArgumentException: MONTH
        //calendar2.set(Calendar.MONTH,13);

        log.info(calendar2.getTime());

        //Calendar的set()方法延迟修改
        //
        //set(int field,int amount) 改变日期的字段时，尽管日历的字段会立即发生更改，
        // 但Calendar所代表的时间是不会立即发生更改的，
        // 直到下次调用get() getTime() getTimeInMillis() add() roll()时才会重新计算日历的时间。
        // 这称为set方法的延迟修改，优势是多次调用set()不会触发多次不必要的计算。

    }

}
