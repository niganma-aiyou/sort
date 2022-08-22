/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package jsontostring;

import com.google.gson.Gson;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/18 9:07
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class gsonTest {
    public static void main(String[] args) {
        Car car = new Car("albi",4);
        Gson gson = new Gson();
        String cjson = gson.toJson(car);
        System.out.println(cjson);

    }
}
