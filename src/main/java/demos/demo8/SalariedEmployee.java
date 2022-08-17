/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo8;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/17 8:35
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class SalariedEmployee extends Employee{

    private Double monthSalary;

    public Double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(Double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public void getSalaryDetails(int month) {
        System.out.println(month+"月，员工类型：月薪员工，"+getName()+"月收入为："+getMonthSalary()+"额外生日薪资为："+getSalary(month));
    }
}
