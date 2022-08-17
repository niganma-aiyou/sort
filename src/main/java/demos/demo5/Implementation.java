/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo5;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 16:53
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Implementation {
    public static void main(String[] args) {
        Student student = new Student("zhangsan",22);
        student.setId("123123");
        student.sleep();
        student.eat();
        student.study();
        System.out.println(student);
    }
}
