/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.reflect;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/17 10:43
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 下面这段代码是以反射机制的方式创建对象。

        // 通过反射机制，获取Class，通过Class来实例化对象
        Class c = Class.forName("features.reflect.User");
        // newInstance() 这个方法会调用User这个类的无参数构造方法，完成对象的创建。
        // 重点是：newInstance()调用的是无参构造，必须保证无参构造是存在的！
        Object obj = c.newInstance();
        String str = c.getName();
        System.out.println(str);
        System.out.println(obj);
    }
}
