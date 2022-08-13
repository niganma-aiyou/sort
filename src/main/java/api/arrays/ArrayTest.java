/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.arrays;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Arrays;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/12 16:20Z
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ArrayTest {
    private static final Logger log = LogManager.getLogger(ArrayTest.class.getName());
    public static void main(String[] args) {
        int[] array = new int[]{1,6,3,9,7,5};
        log.info("{}转换成字符串:{}",array,Arrays.toString(array));

        //多维数组
        int[][]deepArray = new int[][]{{1,3},{2,4}};
        log.info("多维数组转换成字符串:{}", JSON.toJSONString(deepArray));

        //填充数组
        int[] array2 = new int[5];
        Arrays.fill(array2,2);
        log.info(Arrays.toString(array2));

        //部分填充
        int[] array3 = new int[5];
        Arrays.fill(array3,1,4,2);
        log.info(Arrays.toString(array3));

        //排序
        Arrays.sort(array);
        log.info(Arrays.toString(array));

        int[] array4 = new int[]{1,3,5,6,7,9};
        log.info(Arrays.equals(array,array4));

        int[] array5 = Arrays.copyOf(array4,5);
        log.info(Arrays.toString(array5));
    }

}
