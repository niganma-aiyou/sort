/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.newcharacteristic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 9:51
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ConstructorQuote {
    private static final Logger log = LogManager.getLogger(ConstructorQuote.class.getName());

    public static void main(String[] args) {
        Supplier<User> sup1 = new Supplier<User>() {
            @Override
            public User get() {
                return new User();
            }
        };

        //用来创建对象
        log.info("===");
        Supplier<User> sup2 = ()-> new User();

        Supplier<User> sup3 = User::new;

        get(User::new);


    }

    public static  <T> T get(Supplier<T> supplier){
        return supplier.get();

    }


}
