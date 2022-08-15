/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.bug;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/13 14:55
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class FastJsonUtil {

    public static void main(String[] args) {
        System.out.println(JSON.parseArray("[\"3330354\"]", Test.class));
//        System.out.println(JSON.parseArray("[3330354]", Test.class));
    }

    @Data
    public static class Test {
        private String a;
    }
}
