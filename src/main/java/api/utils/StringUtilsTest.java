/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author chuweiyuan
 * @date 2022/8/13 13:32
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class StringUtilsTest {

    private static final Logger log = LogManager.getLogger(StringUtilsTest.class.getName());

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("123141234");

        log.info(str);
        //判空
        log.info(StringUtils.isEmpty(str));
        //判断是否为空
        log.info(StringUtils.isNotEmpty(str));
        //判断某字符串是否为空或长度为0或由空白符(whitespace) 构成
        log.info(StringUtils.isBlank(str));
        // 判断某字符串是否不为空且长度不为0且不由空白符(whitespace) 构成，等于 !isBlank(String str)
        log.info(StringUtils.isNotBlank(str));
        //去掉字符串两端的控制符(control characters, char <= 32) , 如果输入为 null 则返回null
        String ss = " 123123 ";
        String s = "   ";
        log.info(StringUtils.trim(ss));
        log.info(StringUtils.trim(s));
        //去掉字符串两端的控制符(control characters, char <= 32) ,
        // 如果变为 null 或""，则返回 null
        log.info(StringUtils.trimToNull(ss));
        log.info(StringUtils.trimToNull(s));

        // 去掉字符串两端的控制符(control characters, char <= 32) ,
        // 如果变为 null 或 "" ，则返回 ""
        log.info(StringUtils.trimToEmpty(ss));
        log.info(StringUtils.trimToEmpty(s));

        //去掉字符串两端的空白符(whitespace) ，如果输入为 null 则返回 null
        log.info(StringUtils.strip(ss));
        log.info(StringUtils.strip(s));

        // 去掉字符串两端的空白符(whitespace) ，如果变为 null 或""，则返回 null
        log.info(StringUtils.stripToNull(ss));
        log.info(StringUtils.stripToNull(s));

        //去掉字符串两端的空白符(whitespace) ，如果变为 null 或"" ，则返回""
        log.info(StringUtils.stripToEmpty(ss));
        log.info(StringUtils.stripToEmpty(s));

    }
}
