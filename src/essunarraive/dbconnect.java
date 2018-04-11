package essunarraive;
import java.sql.*;
 
public class dbconnect {
public static Connection getconnect(){
    Connection conn = null;// 创建一个数据库连接
    //PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
   // ResultSet result = null;
    String url = "jdbc:oracle:thin:@ess_db";// 连接到本机地址，XE是精简版Oracle的默认数据
    String user = "***";// 用户名 
    String password = "***";//  密码
    String className = "oracle.jdbc.driver.OracleDriver";
    try
    {
        Class.forName(className);// 加载Oracle驱动程序
     } catch (ClassNotFoundException e)
      { e.printStackTrace();}

    try
    {
        conn = DriverManager.getConnection(url, user, password);// 获取连接
        System.out.println("ESS数据库连接建立成功...");
    } catch (SQLException e) {
      e.printStackTrace();}
return conn;
}

public static void close(Connection c) {
if (c != null) {
try {
c.close();
} catch (Throwable e) {
e.printStackTrace();
}
}
}

public static void close(PreparedStatement c) {
if (c != null) {
try {
c.close();
} catch (Throwable e) {
e.printStackTrace();
}
}
}
}

       