/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.collection.list;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/13 15:36
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class LinkedListTest {
    private static final Logger log = LogManager.getLogger(LinkedListTest.class.getName());

    public static void main(String[] args) {
        
        LinkedList<String> s = new LinkedList<>();

        s.add("语文");
        s.add("数学");
        s.add("英语");

//        addFirst(E e) ：在此列表的开始处插入指定的元素。
//        addLast(E e) ：将指定的元素列表的结束。
        s.addFirst("历史");
        s.addLast("地理");

//        getFirst() ：返回此列表中的第一个元素。
//        getLast() ：返回此列表中的最后一个元素。
        log.info(s.getFirst());
        log.info(s.getLast());

//        removeFirst() ：移除并返回此列表中的最后一个元素。
//        removeLast() ：移除并返回此列表中的最后一个元素。
        s.removeFirst();
        s.removeLast();


        log.info(s);

        for(String ss : s){
            log.info(ss);
        }

    }
}
