import java.sql.*;
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

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "2001"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("stdName") + " " +
                                rs.getInt("age")
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
