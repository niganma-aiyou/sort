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
 * @date 2022/8/16 16:13
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Subject {
    private int normalScore;
    private int EndScore;

    public int getNormalScore() {
        return normalScore;
    }

    public void setNormalScore(int normalScore) {
        this.normalScore = normalScore;
    }

    public int getEndScore() {
        return EndScore;
    }

    public void setEndScore(int endScore) {
        EndScore = endScore;
    }

    public void finalScore(int normalScore , int endScore){
        System.out.println(0.3*normalScore+0.7*endScore);
    }
}
