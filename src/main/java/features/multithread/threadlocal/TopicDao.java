/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.threadlocal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/22 13:42
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
// 代码清单4 TopicDao：线程安全
public class TopicDao {
    // ①使用ThreadLocal保存Connection变量
    private static ThreadLocal<Connection> connThreadLocal = new ThreadLocal<Connection>();
    public static Connection getConnection(){
        // ②如果connThreadLocal没有本线程对应的Connection创建一个新的Connection，并将其保存到线程本地变量中。
        return connThreadLocal.get();
    }
    public void addTopic() throws SQLException {
        // ④从ThreadLocal中获取线程对应的Connection
        Statement stat = getConnection().createStatement();
    }
}
// 代码清单3 TopicDao：非线程安全

class TopicDao2 {
    // ①一个非线程安全的变量

    private Connection conn;
    public void addTopic() throws SQLException {
        Statement stat = conn.createStatement();
        // ②引用非线程安全变量
    }
}
