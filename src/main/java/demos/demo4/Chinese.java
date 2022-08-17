/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo4;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 16:20
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Chinese extends LanguageSubject{
    @Override
    public void finalScore(int normalScore, int endScore) {
        System.out.println("语文成绩为:"+(0.3*normalScore+0.7*endScore));
    }
}
