/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.reflect;

import java.lang.reflect.Method;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/17 13:55
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        // 不使用反射机制，怎么调用方法
        // 创建对象
        UserService userService = new UserService();
        userService.setPassword("123");
        userService.setUsername("admin");
        // 调用方法
        /*
            要素分析：
                要素1：对象userService
                要素2：login方法名
                要素3：实参列表
                要素4：返回值
         */
        System.out.println(userService.login("admin", "123") ? "登入成功！" : "登入失败！");

        //使用反射机制调用方法
        Class userServiceClass = Class.forName("features.reflect.UserService");
        // 创建对象
        Object obj = userServiceClass.newInstance();
        // 获取Method
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
//        Method loginMethod = userServiceClass.getDeclaredMethod("login");//注：没有形参就不传
        // 调用方法
        // 调用方法有几个要素？ 也需要4要素。
        // 反射机制中最最最最最重要的一个方法，必须记住。
        /*
            四要素：
            loginMethod方法
            obj对象
            "admin","123" 实参
            retValue 返回值
         */
        //invoke(调用)就是调用Method类代表的方法。它可以让你实现动态调用,例如你可以动态的传人参数

        Object resValues = loginMethod.invoke(obj, "admin", "123");
        //注：方法返回值是void 结果是null

        System.out.println(resValues);
    }
}
