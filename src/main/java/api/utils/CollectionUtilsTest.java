/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.utils;


import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/13 15:34
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class CollectionUtilsTest {
    private static final Logger log = LogManager.getLogger(CollectionUtilsTest.class.getName());

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("zhangsan");
        list2.add("lisi");
        log.info(CollectionUtils.isEmpty(list));
        log.info(CollectionUtils.isNotEmpty(list));
        //交集
        log.info(CollectionUtils.union(list2,list));
        //交集的补集
        log.info(CollectionUtils.disjunction(list2,list));
        //差集
        log.info(CollectionUtils.subtract(list2,list));
        //判断集合是否相等
        log.info(CollectionUtils.isEqualCollection(list2,list));
        //不可修改的集合
        Collection<String> list3 = CollectionUtils.unmodifiableCollection(list2);
        /*list3.add("huawei"); 不能添加代码，会报UnsupportedOperationException 基本不用*/
        log.info(list3);
    }
}
