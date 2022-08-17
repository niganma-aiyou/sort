/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.newcharacteristic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 8:28
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class FunctionQuote {

    private static final Logger log = LogManager.getLogger(FunctionQuote.class.getName());

    public static void main(String[] args) {
        Runnable r1 = ()-> log.info("早");
        r1.run();

        //方法引用：实例对象：：方法
        Consumer<String> con = log::info;
        con.accept("111111");


        Consumer<String> con2 = log::info;
        con2.accept("123123123");

        Consumer<String> con3 =log::info;
        con3.accept("123abc");


        //类：：实例化方法
        Comparator<Integer> com2 = Integer::compareTo;
        log.info(com2.compare(12,23));

        //情景二：类::静态方法
        Function<Double,Long> fun = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        log.info(fun.apply(12.3));
        
        
        Function<Double,Long> fun1 = (num) -> Math.round(num);
        log.info(fun1.apply(12.3));

        Function<Double,Long> fun2 = Math::round;
        log.info(fun2.apply(12.3));

        //情景三：类：：实例化方法
        Comparator<String> com = (o1,o2) -> o1.compareTo(o2);
        log.info(com.compare("abc", "abc"));

        Comparator<String> com1 = String::compareTo;
        log.info(com1.compare("abc","abc"));
    }

}
