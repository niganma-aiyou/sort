/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo4;

/**
 * @author chuweiyuan
 * @date 2022/8/16 16:24
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Implementation {
    public static void main(String[] args) {
        MathSubject mathSubject = new MathSubject();
        mathSubject.setNormalScore(89);
        mathSubject.setEndScore(95);
        mathSubject.finalScore(mathSubject.getNormalScore(),mathSubject.getEndScore());

        Subject subject = new Chinese();
        subject.setNormalScore(100);
        subject.setEndScore(100);
        subject.finalScore(subject.getNormalScore(), subject.getEndScore());

    }
}
