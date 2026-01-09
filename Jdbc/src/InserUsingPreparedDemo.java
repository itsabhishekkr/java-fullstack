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

public class InserUsingPreparedDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "2001"
            );
            String sql = "INSERT INTO student(id,stdName,age) VALUES(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, 10);
            pstmt.setString(2, "Dali");
            pstmt.setInt(3, 30);
            pstmt.executeUpdate();

            pstmt.setInt(1, 11);
            pstmt.setString(2, "Dali");
            pstmt.setInt(3, 30);
            pstmt.executeUpdate();

            pstmt.setInt(1, 12);
            pstmt.setString(2, "Dali");
            pstmt.setInt(3, 30);
            int update=pstmt.executeUpdate();

            System.out.println("row updated " +update);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
