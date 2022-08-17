/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo8;


import static demos.demo8.Constant.WORK_HOUR;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/17 8:42
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class HourlyEmployee extends Employee{
    private int workHour;
    private double hourMonry;

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public double getHourMonry() {
        return hourMonry;
    }

    public void setHourMonry(double hourMonry) {
        this.hourMonry = hourMonry;
    }

    @Override
    public void getSalaryDetails(int month) {
        if(getWorkHour() > WORK_HOUR ){
            System.out.println(month+"月，员工类型：时薪员工，"+getName()+"月收入为："+((getWorkHour()-WORK_HOUR)*getHourMonry()*1.5+getWorkHour()*getHourMonry())+"额外生日薪资为："+getSalary(month));
        }else {
            System.out.println(month+"月,员工类型：时薪员工，"+getName()+"月收入为："+getWorkHour()*getHourMonry()+"额外生日薪资为："+getSalary(month));
        }
    }
}
