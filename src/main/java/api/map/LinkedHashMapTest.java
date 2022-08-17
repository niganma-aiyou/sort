/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/13 15:37
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class LinkedHashMapTest {
    private static final Logger log = LogManager.getLogger(LinkedHashMapTest.class.getName());

    public static void main(String[] args) {
        //LinkedHashMap继承自HashMap
        //put、remove方法LinkedHashMap没有重写，所以可以通过调用父类HashMap的put、remove方法来实现
        //HashMap无序，LinkedHashMap有序，可分为插入顺序和访问顺序两种。
        //
        //如果是访问顺序，那put和get操作已经存在的Entry时都会把Entry移动到双向链表的标为（先删除再插入）。遍历时按照插入顺序排序，原因在于LinkedHashMap的内部类LinkedHashIterator，执行Iterator.next访问链表的下一个元素，所以可以按照插入顺序的输出。
        //
        //LinkedHashMap存储数据，还是跟HashMap一样使用Entry的方式，双向链表只是为了保证顺序。
        //
        //HashMap的遍历速度和他的容量有关，而LinkedHashMap只跟实际数量有关。
        //
        //LinkedHashMap按照插入顺序排序，HashMap基于哈希表乱序。
        //
        //基于LinkedHashMap实现,如:Mybatis框架中的LruCache
        //
        //基于HashMap实现,如:Mybatis框架中的PerpetualCache
        log.info("");
    }
}
