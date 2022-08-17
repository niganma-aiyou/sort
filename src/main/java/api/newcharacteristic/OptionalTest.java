/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.newcharacteristic;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/16 15:32
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class OptionalTest {
    private static final Logger log = LogManager.getLogger(OptionalTest.class.getName());

    public static void main(String[] args) {
        //1、of()方法用于处理不为空对象,ofNullable()方法用于处理可空对象,empty()，不接受任何参数，返回此Optional类的空实例。
        //2、在Optional的每个map方法中,如果任意一个为null,则跳转到orElse()提供参数
        //3、Optional的ifPresent()方法只有当ifPresent前面所有环节值都存在的时候才起作用
        //4、orElseThrow()在不满足条件时候会抛出异常
        //5、filter用于流式过滤(参考stream)
        //6、flatMap用于展开复杂结构(参考stream)

        FooIns fooIns = new FooIns();
        Foo foo1 = new Foo();
        Foo foo2 = null;
        foo1.setAttr("Attr");
        fooIns.setFoo1(foo1);
        fooIns.setFoo2(foo2);
        log.info(Optional.of(fooIns).map(FooIns::getFoo1).map(Foo::getAttr).orElse("default value"));
        //Attr
        log.info(Optional.of(fooIns).map(FooIns::getFoo1).map(Foo::getAttr).get());
        //Attr
        log.info(Optional.of(fooIns).map(FooIns::getFoo2).map(Foo::getAttr).orElse("default value"));
        //default value
        log.info(Optional.ofNullable(foo2).map(Foo::getAttr).orElse("default value"));
        //default value
        Optional.ofNullable(foo2).map(Foo::getAttr).ifPresent(System.out::println);
        // 不打印
        Optional.of(foo1).map(Foo::getAttr).ifPresent(System.out::println);
        // Attr
        Optional.of(foo1).orElseThrow(() -> new RuntimeException("foo1 is null"));
        // 无异常
        Optional.ofNullable(foo2).orElseThrow(() -> new RuntimeException("foo1 is null"));
        // RuntimeException
        log.info(Optional.of(fooIns).map(FooIns::getFoo2).map(Foo::getAttr).get());
        // Exception
        log.info(Optional.of(foo2).map(Foo::getAttr).orElse("default value"));
        // Exception


        log.info("====================================================================");
        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));
        //[Optional.empty, Optional[foo], Optional.empty, Optional[bar]]
        log.info(listOfOptionals);
        List<String> filteredList = listOfOptionals.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        // [foo, bar]
        log.info(filteredList);

        log.info("============================================");
        List<String> filteredList2 = listOfOptionals.stream()
                .flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty())
                .collect(Collectors.toList());
        // [foo, bar]
        System.out.println(filteredList2);
        List<String> filteredList1 = listOfOptionals.stream()
                .flatMap(o -> o.map(Stream::of).orElseGet(Stream::empty))
                .collect(Collectors.toList());
        // [foo, bar]
        System.out.println(filteredList1);


    }
}
@Data
class Foo {
    private String attr;
}

@Data
class FooIns {
    private Foo foo1;
    private Foo foo2;
}

