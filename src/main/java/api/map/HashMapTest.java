/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/13 15:37
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class HashMapTest {
    private static final Logger log = LogManager.getLogger(HashMapTest.class.getName());

    public static void main(String[] args) {
        //16是默认值
        HashMap<Integer,String> hashMap = new HashMap<>(16);
        hashMap.put(1,"taobao");
        hashMap.put(2,"alibaba");
        hashMap.put(3,"jingdong");
        log.info(hashMap);
        log.info(hashMap.get(2));
        hashMap.put(0,"hhh");
        log.info(hashMap);
        hashMap.remove(0);
        log.info(hashMap);
        log.info(hashMap.containsKey(2));
        log.info(hashMap.containsValue("hhh"));
        log.info(hashMap.entrySet());
        log.info(hashMap.keySet());
        hashMap.clear();
        log.info(hashMap.isEmpty());
    }
}
