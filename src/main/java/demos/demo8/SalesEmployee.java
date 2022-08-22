/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo8;

/**
 *TODO 销售员工的类
 * @author chuweiyuan
 * @date 2022/8/17 8:53
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class SalesEmployee extends Employee{
    private Double monthSales;
    private Double upRate;

    public Double getMonthSales() {
        return monthSales;
    }

    public void setMonthSales(Double montySales) {
        this.monthSales = montySales;
    }

    public Double getUpRate() {
        return upRate;
    }

    public void setUpRate(Double upRate) {
        this.upRate = upRate;
    }

    @Override
    public void getSalaryDetails(int month) {
        System.out.println(month+"月，员工类型：无底薪销售员工，"+getName()+"月收入为："+getUpRate()*getMonthSales()+"额外生日薪资为："+getSalary(month));
    }
}
