/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.demo07;

import demos.demo07.Car;
import demos.demo07.DieselEngine;
import demos.demo07.ElectromotorEngine;
import demos.demo07.GasolineEngine;
import org.junit.Test;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 17:30
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class TestDemo {

    @Test
    public void CarTest(){
        DieselEngine dieselEngine = new DieselEngine();
        ElectromotorEngine electromotorEngine = new ElectromotorEngine();
        GasolineEngine gasolineEngine = new GasolineEngine();
        Car car = new Car(dieselEngine);
        car.drive();
        Car car1 = new Car(electromotorEngine);
        car1.drive();
        Car car2 = new Car(gasolineEngine);
        car2.drive();
        new Car(dieselEngine).drive();
    }
}
