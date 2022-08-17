/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.math;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/15 14:41
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class BigDecimalTest {
    private static final Logger log = LogManager.getLogger(MathTest.class.getName());

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(17.23d);
        //toString()
        //将BigDecimal对象中的值转换成字符串
        log.info(a.toString());
        //doubleValue()
        //将BigDecimal对象中的值转换成双精度数
        log.info(a.doubleValue());
        //floatValue()
        //将BigDecimal对象中的值转换成单精度数
        log.info(a.floatValue());
        //longValue()
        log.info(a.longValue());
        //将BigDecimal对象中的值转换成长整数
        log.info(a.intValue());
    }
}
