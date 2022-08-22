/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package jsontostring;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/18 8:21
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Car {
    private String brand = null;
    private int doors = 0;

    public Car(String brand,int doors){
        this.brand = brand;
        this.doors = doors;
    }
    public Car(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", doors=" + doors +
                '}';
    }
}
