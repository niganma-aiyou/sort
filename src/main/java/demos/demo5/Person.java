/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo5;

/**
 * @author chuweiyuan
 * @date 2022/8/16 16:36
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public abstract class Person {
    protected String name;
    protected Integer age;

    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }

    public Person(String name , int age){
        this.name=name;
        this.age = age;
    }

}
