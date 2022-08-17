/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo8;
import java.time.MonthDay;

import static demos.demo8.Constant.MONTH;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/17 9:05
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Implementation {
    public static void main(String[] args) {
        BasePlusSalesEmployee basePlusSalesEmployee = new BasePlusSalesEmployee();
        basePlusSalesEmployee.setBirthday(MonthDay.parse("--07-07"));
        basePlusSalesEmployee.setMonthSales(6000.00);
        basePlusSalesEmployee.setUpRate(0.3);
        basePlusSalesEmployee.setBasicSalary(5000.00);
        basePlusSalesEmployee.setName("张三");
        //basePlusSalesEmployee.getSalaryDetails(MONTH);


        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setBirthday(MonthDay.parse("--09-08"));
        hourlyEmployee.setWorkHour(180);
        hourlyEmployee.setHourMonry(100);
        hourlyEmployee.setName("李四");
        //hourlyEmployee.getSalaryDetails(MONTH);

        SalesEmployee salesEmployee = new SalesEmployee();
        salesEmployee.setBirthday(MonthDay.parse("--08-08"));
        salesEmployee.setName("王五");
        salesEmployee.setMonthSales(9000.00);
        salesEmployee.setUpRate(0.8);
        //salesEmployee.getSalaryDetails(MONTH);

        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.setMonthSalary(9000.00);
        salariedEmployee.setBirthday(MonthDay.parse("--08-15"));
        salariedEmployee.setName("赵六");
        //salariedEmployee.getSalaryDetails(MONTH);

        Employee[] employees = {salesEmployee,salariedEmployee,hourlyEmployee,basePlusSalesEmployee};
        for(int i = 0 ; i < employees.length ; i++){
            employees[i].getSalaryDetails(MONTH);
        }
    }
}
