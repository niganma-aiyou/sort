/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package jsontostring;
import com.alibaba.fastjson.JSON;
/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/18 9:47
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class FastjsonTest {
    public static void main(String[] args) {
        Car car = new Car("albi",4);

        String s = JSON.toJSONString(car);
        System.out.println(s);
    }
}
