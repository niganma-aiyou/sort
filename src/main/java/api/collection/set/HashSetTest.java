/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.collection.set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.function.Consumer;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/13 15:36
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class HashSetTest {
    private static final Logger log = LogManager.getLogger(HashSetTest.class.getName());

    public static void main(String[] args) {
        //HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
        //
        //HashSet 允许有 null 值。
        //
        //HashSet 是无序的，即不会记录插入的顺序。
        //
        //HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
        //
        //HashSet 实现了 Set 接口。
        //
        //HashSet 中的元素实际上是对象，一些常见的基本类型可以使用它的包装类。

        //添加元素
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("google");
        hashSet.add("fox");
        hashSet.add("QQ");
        //重复的不会被添加
        hashSet.add("google");
        log.info(hashSet);

        //判断元素是否存在
        log.info(hashSet.contains("google"));

        hashSet.add("taobao");
        log.info(hashSet);
        hashSet.remove("taobao");
        log.info(hashSet);
        log.info(hashSet.size());

        for (String s :hashSet
             ) {
            log.info(s);
        }


        /*hashSet.forEach((String s)->{
            log.info(s);可以继续简化成底下一行代码
        });*/
        hashSet.forEach(log::info);
        hashSet.clear();
        log.info(hashSet.isEmpty());
        hashSet.forEach(log::info);


        //HashSet存储顺序：
        // HashSet底层以HashMap维护，其元素顺序即对应map的存储顺序，
        // HashMap的存储顺序是key的hash值对数组长度取模然后按照先后顺序存入链表
    }
}
