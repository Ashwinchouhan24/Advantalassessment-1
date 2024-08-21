
package advantal;
import java.sql.*;
public class D5q2 {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employee";
            String username = "root";
            String pass = "ashu@123";
            con = DriverManager.getConnection(url, username , pass );
            Statement s=con.createStatement();
            ResultSet r=s.executeQuery("select * from employee");
            while(r.next()){
                System.out.println(r.getInt("empid") + " " + r.getString("empname") + " " + r.getString("branch"));
            }
            System.out.println(con);
        } catch(Exception e){
            System.out.println("error");
        } finally {
            try {
                con.close();
                System.out.println("connection closed");
            } catch (Exception e) {
                System.out.println("Connection Not Closed");
            }
        }

    }
}

