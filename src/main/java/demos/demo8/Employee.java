/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo8;

import java.time.MonthDay;

/**
 *所有员工类的父类
 *
 * @author chuweiyuan
 * @module 计算员工薪酬
 * @date 2022/8/17 8:12
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Employee {
    private String name;
    private MonthDay birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MonthDay getBirthday() {
        return birthday;
    }

    public void setBirthday(MonthDay birthday) {
        this.birthday = birthday;
    }

    public double getSalary(int month){
        if(getBirthday().getMonthValue() == month){
            return 100;
        }else {
            return 0;
        }

    }

    public void getSalaryDetails(int month){}
}
