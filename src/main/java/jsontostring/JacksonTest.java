/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package jsontostring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/18 8:19
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class JacksonTest {
    //Jackson 最常用的 API 就是基于"对象绑定" 的 ObjectMapper：

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String carJson = "{\"brand\":\"Mercedes\",\"doors\":5}";
        String jsonArray = "[{\"brand\":\"ford\"}, {\"brand\":\"Fiat\"}]";

        Car car1 = new Car();
        car1.setBrand("aaa");
        car1.setDoors(3);
        int[] ints = {1,2,3,4,5};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        stringBuilder.append(2);
        stringBuilder.append(3);
        stringBuilder.append(4);
        String a = objectMapper.writeValueAsString(ints);
        String b = objectMapper.writeValueAsString(stringBuilder);
        System.out.println(a);
        System.out.println(b);

        try {
            Car car = objectMapper.readValue(carJson, Car.class);
            List<Car> cars = objectMapper.readValue(jsonArray, new TypeReference<List<Car>>(){});

            System.out.println("car brand = "+ car.getBrand());
            System.out.println("car doors = "+ car.getDoors());
            System.out.println(cars);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
