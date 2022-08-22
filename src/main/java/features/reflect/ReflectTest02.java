/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.reflect;

import java.lang.reflect.Field;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/17 13:07
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ReflectTest02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //不使用反射机制给属性赋值
        User user = new User();
        /**给属性赋值三要素：给s对象的no属性赋值1111
         * 要素1：对象s
         * 要素2：no属性
         * 要素3：1111
         */
        user.no = 1111;
        /**读属性值两个要素：获取s对象的no属性的值。
         * 要素1：对象s
         * 要素2：no属性
         */
        System.out.println(user.no);

        //使用反射机制给属性赋值
        Class userClass = Class.forName("features.reflect.User");
        Object obj = userClass.newInstance();
        // obj就是User对象。（底层调用无参数构造方法）

        // 获取no属性（根据属性的名称来获取Field）
        Field noField = userClass.getDeclaredField("no");
        // 给obj对象(Student对象)的no属性赋值
        /*
            虽然使用了反射机制，但是三要素还是缺一不可：
                要素1：obj对象
                要素2：no属性
                要素3：22222值
            注意：反射机制让代码复杂了，但是为了一个“灵活”，这也是值得的。
         */
        noField.set(obj, 22222);

        // 读取属性的值
        // 两个要素：获取obj对象的no属性的值。
        System.out.println(noField.get(obj));

        System.out.println("====================================================");
        Field nameField = userClass.getDeclaredField("name");
        // 打破封装（反射机制的缺点：打破封装，可能会给不法分子留下机会！！！）
        // 这样设置完之后，在外部也是可以访问private的。
        nameField.setAccessible(true);
        // 给name属性赋值
        nameField.set(obj, "xiaowu");
        // 获取name属性的值
        System.out.println(nameField.get(obj));
    }
}
