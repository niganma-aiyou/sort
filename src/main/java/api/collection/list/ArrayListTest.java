/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.collection.list;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/13 15:36
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ArrayListTest {
    private static final Logger log = LogManager.getLogger(ArrayListTest.class.getName());

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");

        int length = list.size();
        log.info(length);

        String s = list.get(0);
        log.info(s);

        //add(int index, Object element)  方法用于在集合指定位置添加元素，原集合中从指定位置开始的元素全部后置
        list.add(0,"MMM");
        log.info(list.get(0));
        log.info(list.get(1));

        list.set(0,"TTT");
        log.info(list.get(0));

        /*Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            log.info(iterator.next());
        }*/
        for (String ss : list
             ) {
            log.info(ss);
        }

        log.info(list.contains("Tom"));

        log.info(list.remove(0));

        log.info(list.isEmpty());
        list.clear();
        log.info(list.isEmpty());

    }
}
