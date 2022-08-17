/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo07;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 17:21
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void drive(){

        System.out.println(engine.start());
        System.out.println("汽车以启动");
    }
}
