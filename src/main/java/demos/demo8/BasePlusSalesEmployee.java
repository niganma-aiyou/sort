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
 * @date 2022/8/17 8:58
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class BasePlusSalesEmployee  extends SalesEmployee{
    private Double basicSalary;

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public void getSalaryDetails(int month) {
        System.out.println(month+"月，员工类型：有底薪的销售员工，"+getName()+"的月收入为："+(getUpRate()*getMonthSales()+getBasicSalary())+"额外生日薪资为："+getSalary(month));
    }
}
