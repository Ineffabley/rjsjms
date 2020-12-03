import java.sql.*;

/**
 * @author ywq
 * @date 2020/12/3 15:54
 */
public class Create extends DbUtil{
    private String driverStr = "com.mysql.jdbc.Driver";
    private String connStr = "jdbc:mysql://localhost:3306/test?useSSL=false&useUnicode=true&characterEncoding=utf-8";
    private String dbusername = "root";
    private String dbpassword = "root";
    private Connection conn = null;
    private Statement stmt = null;
    protected void connDb() {
        try {
            Class.forName(driverStr);
            conn = DriverManager.getConnection(connStr, dbusername, dbpassword);
            stmt =  conn.createStatement();
            System.out.println("数据库连接成功!");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("数据库连接失败！");
        }
    }
    protected void openDb() {
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    protected void useDb() {
        try {
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet rs = metaData.getTableTypes();
            ResultSetMetaData metaData2 = rs.getMetaData();
            int count = metaData2.getColumnCount();
            while(rs.next()){
                for(int i = 0 ; i <count; i++){
                    Object object = rs.getObject(i+1);
                    String columnName = metaData2.getColumnName(i+1);
                    System.out.println(columnName+":"+object+"\t");
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    protected void closeDb() {
        if(stmt!=null)
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        if(conn!=null)
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}