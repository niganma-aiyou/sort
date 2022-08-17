/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.math;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/15 14:19
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class BigIntegerTest {
    private static final Logger log = LogManager.getLogger(BigIntegerTest.class.getName());

    public static void main(String[] args) {

        //value.Of(参数); 这个函数的作用是将括号内的参数转换成指定的数据类型
        int a = 43;
        BigInteger b = BigInteger.valueOf(a);
        log.info(b);

        //不重写的话，jdk1.8 版本是无法支持这种转换的
        // String s = "12345";
        //BigInteger b1 = BigInteger.valueOf(s);
        BigInteger c = BigInteger.valueOf(123);
        log.info(b.add(c));
        log.info(b.subtract(c));
        log.info(b.multiply(c));
        log.info(b.divide(c));

        //取余
        log.info(b.remainder(c));

        //方法pow(exponent)方法，这个函数的作用是将大整数取exponent的指数，例如a.pow(b)==a^b;
        log.info(b.pow(6));

        //gcd()方法，这个函数的作用是将两个大整数取最大公约数
        log.info(b.gcd(c));

        //abs()方法，这个函数的作用是取绝对值

        BigInteger c1 = new BigInteger("-9");
        log.info(c1.abs());

        //negate()方法，这个函数的作用是取数的相反数，例如
        log.info(b.abs());

        //mod()方法; 这个函数的作用是对数进行取余 a.mod(b)=a%b=a.remainder(b);
        log.info(b.mod(c));

        //max()方法，min()方法，分别是比较两个数的大小，例如a.max(b); 取a,b中的最大值
        log.info(b.max(c));

        //compareTo()方法这个方法是用来比较两个大整数大小的
        log.info(b.compareTo(c));

    }
}
