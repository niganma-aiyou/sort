/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.demos.demo6;

import demos.demo6.Cat;
import demos.demo6.Dog;
import demos.demo6.Pet;
import org.junit.Test;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 16:56
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class TestDemo {

    @Test
    public void PetTest(){
        Pet p = new Cat();
        p.play();

        Pet p2 = new Dog();
        p2.play();
    }
}
