/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo3;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 15:51
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Implementation {
    public static void main(String[] args) {
        Powder powder = new Powder();
        System.out.println(powder.checkResult());

        Powder powder1 = new Powder("牛肉面",3,false);
        System.out.println(powder1.checkResult());
        Powder powder2 = new Powder("排骨面",3);
        System.out.println(powder2.checkResult());
    }
}
