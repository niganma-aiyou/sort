/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.math;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/12 16:03
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class MathTest {
    private static final Logger log = LogManager.getLogger(MathTest.class.getName());

    public static void main(String[] args) {


        //返回绝对值
        int a = -8;
        double b = 90.0;
        float c = -90.0f;
        double d = 90.9;
        double e = 90.3;
        float f = 90.9f;
        float g = 90.3f;
        log.info("绝对值:");
        log.info("a+:{}",Math.abs(a));
        log.info("b+{}",Math.abs(b));
        log.info("c+{}",Math.abs(c));
        log.info("=================================");

        //返回一个最接近的int，long整型值，四舍五入
        log.info("最近接的整数:");
        log.info("d+{}",Math.round(d));
        log.info("e+{}",Math.round(e));
        log.info("f+{}",Math.round(f));
        log.info("g+{}",Math.round(g));

        log.info( Math.random() );
        log.info( Math.random() );

        Random rand=new Random();
        //  生成0-100的随机数
        int i=(int)(Math.random()*100);
        // 这里是一个方法的重载，参数的内容是指定范围
        int j=rand.nextInt(100);
        // 分别输出两个随机数
        log.info("i:{} \n j:{}",i,j);
    }
}
