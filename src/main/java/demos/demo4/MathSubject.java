/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo4;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/16 16:16
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class MathSubject extends Subject{
    @Override
    public void finalScore(int addendance, int homework) {
        System.out.println("数学成绩为："+(0.4*addendance+0.6*homework));
    }
}
