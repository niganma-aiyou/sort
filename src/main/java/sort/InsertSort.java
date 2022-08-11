
package sort;


import org.jetbrains.annotations.NotNull;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import static sort.UniqueCode.LENGTH;

/**
 * 插入排序，48,62,35,77,55,14,35,98从小到大排列
 *思想：将数据分为俩队，一队是已经排好序的数据，另外一队为还没有进行排序的数据。
 * 一开始假设只有第一个数字是有序的，则只有第一个数字即48在已经排好序的队列里。
 * 接下来取数据中的第二个数字62，因为62大于48，所以应该排在48后面，与原先相同故不需要进行交换。
 * 此时48,62在已经排好序的队列中，且数据在队列中按升序排好。
 * 再取第三个数据35,35大于48，需要排在48前面，故将48,62,向后移动一位空出第一位让35插入。.....一直这样直至将所有的数据排好。
 *
 * @author chuweiyuan
 * @module 排序算法
 * @date 2022/8/10 10:30
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class InsertSort {
    private static final Logger log = LogManager.getLogger(loginTestCase.class.getName());

    public static void main(String[] args) {

        int[] arr = {48,62,35,77,55,14,35,98};
        sort(arr);
        for (int array : arr) {

        }
        System.out.println("\n");
    }
    public static void sort(int @NotNull [] arr){
        if(arr.length >= LENGTH){
            for(int i = 1 ; i < arr.length;i++){
                // 挖出一个用来插入的值，同时位置上留下一个可以存储新值的坑
                int x = arr[i];
                int j = i-1;
                //当前面有一个或多个值比x大的时候，一直循环往前找，将x插入到这串值前面
                while (j >= 0 && arr[j]>x){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = x ;
            }
        }


    }


}
