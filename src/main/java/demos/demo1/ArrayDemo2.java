/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package demos.demo1;

import java.util.Arrays;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 14:57
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ArrayDemo2 {
    //现在给出两个数组：
    //·数组a：{1，7，9，11，13，15，17，19}；
    //·数组b：{2，4，6，8，10}
    //两个数组合并为数组c，按升序排列。

    public static void main(String[] args) {
        int[] a = {1,7,9,11,13,15,17,19};
        int[] b = {2,4,6,8,10};
        int[] c = new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);
        for (int i:c
             ) {
            System.out.println(i);
        }
    }
}
