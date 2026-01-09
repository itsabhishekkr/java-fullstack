import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//🔑 Key JDBC Flow (Interview Ready)
//
//Load Driver
//
//Create Connection
//
//Create Statement
//
//Execute Query
//
//Process ResultSet
//
//Close Connection

public class JDBCInsertDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "2001"
            );

            Statement stmt = con.createStatement();
            String sql = "insert into student values (7,'pramila',31)";
            int updata = stmt.executeUpdate(sql);
            System.out.println("updata:" + updata);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
