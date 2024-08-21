
package advantal;
import java.sql.*;
public class D5q1 {
    public static void main(String[] args) {
        Connection con = null;
       try{
          //  System.out.println("running");
           Class.forName("com.mysql.cj.jdbc.Driver");
           String url = "jdbc:mysql://localhost:3306/Employee";
           String username = "root";
           String pass = "ashu@123";
           // System.out.println("running");
           con = DriverManager.getConnection(url, username , pass );
           // System.out.println("running");
           Statement s=con.createStatement();
//              System.out.println("running");
           ResultSet r=s.executeQuery("select * from employee");
           while(r.next()){
               System.out.println(r.getInt("empid"));
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
