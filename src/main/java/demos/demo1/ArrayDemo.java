/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo1;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 14:42
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] oldArr ={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int j=0;
        for (int value : oldArr) {
            if (value != 0) {
                j++;
            }
        }
        int []newarr=new int[j];
        j=0;
        for (int k : oldArr) {
            if (k != 0) {
                newarr[j] = k;
                j++;
            }
        }
        for (int k : newarr) {
            System.out.println(k);
        }
    }
}
