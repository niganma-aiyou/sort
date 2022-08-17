/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.newcharacteristic;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author chuweiyuan
 * @date 2022/8/16 10:00
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class StreamApi {

    private static final Logger log = LogManager.getLogger(StreamApi.class.getName());

    public static void main(String[] args) {
        //创建stream
        List<String> lists = new ArrayList<String>() {
        };
        lists.add("able");
        lists.add("baby");
        lists.add("cat");
        //返回一个顺序流
        Stream<String> stream = lists.stream().filter(str -> {
            log.info("中间操作");
            return "able".equals(str);
        });
        stream.forEach(log::info);
        log.info("=============================================================");
        //返回一个并行流
        Stream<String> stream1 = lists.parallelStream().filter(StringUtils::isNotEmpty)
                .skip(2);
        stream1.forEach(log::info);


        log.info("==============================================================");

        List<Integer> num = new ArrayList<Integer>(){};
        num.add(1);
        num.add(1);
        num.add(2);
        num.add(1);
        num.add(3);

        Stream<Integer> stream2 = num.stream().distinct();
        stream2.forEach(log::info);
        num.stream().distinct().forEach(log::info);
        log.info("==========================================================");
        //通过数组实例化流
        int[] nums = {1, 2, 7, 4, 9, 6};
        IntStream arrStream = Arrays.stream(nums).filter(i -> i > 1).limit(3);
        arrStream.forEach(log::info);
        log.info("================================================================  ==");
        //实例化流的方式三：通过stream的of()方法
        Stream<Integer> integerStream = Stream.of(12, 23, 233);

        //实例化方式四：创建无限流
        //遍历前10个偶数
        //迭代
        Stream.iterate(0, t -> t + 2).limit(10).forEach(log::info);

        log.info("=============================================================   =====");
        //生成
        Stream.generate(Math::random).limit(10).forEach(log::info);
        log.info("==================================================================");

        Arrays.stream(nums).filter(value -> value == 3 || value == 5).forEach(log::info);

        log.info("=================================================  =================");
        //map——接收 Lambda ， 将元素转换成其他形式或提取信息。
        // 接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        List<String> strList = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
        Stream<Stream<Character>> stream3 = strList.stream()
                .map(StreamApi::filterCharacter);

        stream3.forEach(sm -> sm.forEach(log::info));
        log.info("=============================================================");
        //flatMap:将所有流连接成一个流
        Stream<Character> stream4 = strList.stream()
                .flatMap(StreamApi::filterCharacter);
        stream4.forEach(log::info);
        log.info("========================= ====================================");
        List<Integer> num1 = new ArrayList<Integer>(){};
        num1.add(1);
        num1.add(4);
        num1.add(2);
        num1.add(0);
        num1.add(9);

        num1.stream().sorted().distinct().forEach(log::info);
        //sorted 方法中，我们重写compare方法：如果return是1，则是按照原先的排序排。-1则是按照逆序排
        num1.stream().sorted((x,y)-> (x < y) ? 1 : ((x.equals(y)) ? 0 : -1)).distinct().forEach(log::info);
        integerStream.sorted().forEach(log::info);
        log.info("=====================================");
        //检查是否所有值都满足以下条件
        boolean b1 = num1.stream().allMatch(e->e>-1);
        log.info(b1);
        //检查是否至少有一个值满足以下条件
        boolean b2 = num1.stream().anyMatch(e->e>5);
        log.info(b2);
        //检查是否没有值满足以下条件
        boolean b3 = num1.stream().noneMatch(e->e>10);
        log.info(b3);
        log.info("========================================");
        //从大到小排列，取第一个，相当于max
        Integer a = num1.stream().sorted((x,y)-> (x < y) ? 1 : ((x.equals(y)) ? 0 : -1)).findFirst().get();
        log.info(a);
        //串行流，一个一个查，顺序不变，一般是拿第一个。
        Integer b = num1.stream().filter(e->e>3).findAny().get();
        log.info(b);
        //并行流，多线程一起查，随机拿符合条件的
        Integer c = num1.parallelStream().filter(e->e>3).findAny().get();
        log.info(c);
    }

    public static Stream<Character> filterCharacter(String str) {
        List<Character> list = new ArrayList<>();
        for (Character ch : str.toCharArray()) {
            list.add(ch);
        }
        return list.stream();
    }

}

