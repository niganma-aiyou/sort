package sort;
/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */

/**
 * 简单的说, 就是设置一个标准值, 将大于这个值的放到右边(不管排序), 将小于这个值的放到左边(不管排序), 那么这样只是区分了左小右大, 没有排序, 没关系, 左右两边再重复这个步骤.直到不能分了为止.
 * 详细说就是:
 * 选择待排数列的首部第一个元素为基准元素x，设置两指针，分别指向数列首尾部位置，假设两指针分别设为i和j。
 * 每次遍历的过程是这样的，首先从右到左遍历指针j所指向的元素，直到j指向的元素值小于基准元素x时，停止遍历，将其放到i的位置(因为i的值已经拷贝成了基准x腾出了位置)
 * i往右挪一步, i++,接着轮到指针i从左到右遍历,直到i所指向的元素值大于基准元素x时，停止遍历，将其放到j的位置(因为上面一步j的值已经占用到了i的位置,腾出位置了)
 * 依此类推，两边轮流遍历, 直到指针i与指针j相等或者大于(实际肯定是i==j)时，停止外部循环。此时必定左边都是比x小的, 右边是比x大的.
 * 最后直接将基准元素x直接放置于指针i所指向的位置即可
 * 完成分区操作, 从i的位置一分为二, 左边和右边再递归执行上面的操作. 层层细分
 *
 * @author chuweiyuan
 * @module sort
 * @date 2022/8/10 14:54
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {48,62,35,77,55,14,36,98};
        int begin = 0;
        int end = arr.length-1;
        sort(arr,begin,end);
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("\n");
    }

    public static void sort(int[] arr, int begin, int end) {
        int a = begin;
        int b = end;
        if (a >= b) {
            return;
        }

        int x = arr[a];
        while (a < b) {
            while (a < b && arr[b] >= x) {
                b--;
            }
            if (a < b) {
                arr[a] = arr[b];
                a++;
            }
            while (a < b && arr[a] <= x) {
                a++;
            }
            if (a < b) {
                arr[b] = arr[a];
                //排序的终止位置前移一位
                b--;
            }
        }
        //跳出循环 a < b的逻辑不成立了,a==b重合了,此时将x赋值回去arr[a]
        arr[a] = x;
        //调用递归函数,再细分再排序
        sort(arr, begin, b - 1);
        sort(arr, a + 1, end);
    }
}