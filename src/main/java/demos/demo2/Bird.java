/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo2;


/**
 *
 * @author chuweiyuan
 * @date 2022/8/16 15:08
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Bird extends Animal implements A{
    @Override
    public void fly() {
        System.out.println("鸟儿飞翔");
    }

    @Override
    public void eat() {
        System.out.println("鸟儿吃虫");
    }
}
