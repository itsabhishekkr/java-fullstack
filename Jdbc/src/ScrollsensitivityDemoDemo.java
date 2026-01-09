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

public class ScrollsensitivityDemoDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "2001"
            );

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            //TYPE_FORWARD_ONLY
            rs.last();
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getInt("age"));
            System.out.println(rs.getString("stdName"));

            rs.first();
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getInt("age"));
            System.out.println(rs.getString("stdName"));

            rs.absolute(3);
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getInt("age"));
            System.out.println(rs.getString("stdName"));
            

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
