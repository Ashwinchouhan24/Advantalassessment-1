
package advantal;
import java.sql.*;

public class D5q6 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement psmt =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "ashu@123");
           con.setAutoCommit(false);
           String s1 = "insert into employee values(?,?,?)";
           psmt = con.prepareStatement(s1);
           psmt.setInt(1, 7);
           psmt.setString(2, "Williamson");
           psmt.setString(3, "new zealand");
           psmt.execute();
           Statement ss = con.createStatement();
           con.commit();
           ResultSet rs = ss.executeQuery("select * from employee");
            while(rs.next()){
                System.out.println(rs.getString("empname"));
            }
            System.out.println("Conmmit successfull");
        } catch (Exception e) {
            if( con != null){
                try {
                    System.out.println("Rolled back");
                    con.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } finally {
                try {
                    if( psmt != null) psmt.close();
                    if(con != null) con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}