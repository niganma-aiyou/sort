/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *通过反射获取方法名
 * @author chuweiyuan
 * @module  反射
 * @date 2022/8/17 13:17
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ReflectTest03 {
    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder s = new StringBuilder();

        Class userServiceClass = Class.forName("java.lang.String");

        //getModifiers()方法用于返回此类或接口的修饰符
        s.append(Modifier.toString(userServiceClass.getModifiers()));
        s.append(" class ");
        //得到类的简写名称
        s.append(userServiceClass.getSimpleName());
        s.append(" {\n");

        // 获取所有的Method（包括私有的！）反映此Class对象所表示的类或接口的指定已声明方法。
        Method[] methods = userServiceClass.getDeclaredMethods();
        for (Method m : methods){
            s.append("\t");
            // 获取修饰符列表
            s.append(Modifier.toString(m.getModifiers()));
            s.append(" ");
            // 获取方法的返回值类型
            s.append(m.getReturnType().getSimpleName());
            s.append(" ");
            // 获取方法名
            s.append(m.getName());
            s.append("(");
            // 方法的修饰符列表（一个方法的参数可能会有多个。）
            Class[] parameterTypes = m.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++){
                s.append(parameterTypes[i].getSimpleName());
                if (i != parameterTypes.length - 1)
                {
                    s.append(", ");
                }
            }
            s.append(") {}\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
