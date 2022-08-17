/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.newcharacteristic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/16 14:21
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class OptionalUse {
    private static final Logger log = LogManager.getLogger(OptionalUse.class.getName());

    public static void main(String[] args) {
        Girl girl1 = new Girl();
        //of(T t )的参数t不可以为空
        // 将girl1设置为null;
        // of
        Optional<Girl> girl2 = Optional.of(girl1);
        log.info(girl2);
        girl1 = null;
        //ofNullable(T t) 参数t可以为空
        Optional<Girl> girl3 = Optional.ofNullable(girl1);
        log.info(girl3);
        //判断是否包含对象
        log.info(girl3.isPresent());

        //empty() 创建一个空的 Optional 实例
        Optional<Girl> girl4 = Optional.empty();
        log.info(girl4.isPresent());

        Optional<Girl> girl5 = Optional.ofNullable(new Girl());
        girl5.ifPresent(girl -> log.info(girl));

        log.info("==========================");

        Boy boy1 = null;
        log.info(boy1);
        Boy boy2 = new Boy(new Girl("Zhuli"));
        log.info(boy2);
        log.info("========================================================================");
        OptionalUse a = new OptionalUse();
        log.info(a.getGirlName(boy2));
    }
    public String getGirlName(Boy boy){
        Optional<Boy> boy1 = Optional.ofNullable(boy);
        //boy2一定不为空
        Boy boy2 = boy1.orElse(new Boy(new Girl("Amy")));
        Girl girl = boy2.getGirl();
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        //orElse如果为空着返回设置的name，不为空就返回原值
        Girl girl2 = girl1.orElse(new Girl("Jane"));
        //girl2不为空
        return girl2.getName();

    }
}
