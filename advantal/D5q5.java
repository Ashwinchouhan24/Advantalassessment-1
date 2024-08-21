package advantal;
import java.sql.*;

public class D5q5 {
    public static void main(String[] args) {

        Connection con = null;

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "ashu@123");
          //  System.out.println("runnign");
            String ss = "{call getEmployee(?)}";
       //     System.out.println("runnign");
            CallableStatement obj = con.prepareCall(ss);
          //  System.out.println("runnign");
            obj.setInt(1,1);
          //  System.out.println("runnign");
            ResultSet rs= obj.executeQuery();
           // System.out.println("runnign");
            while(rs.next()){
                System.out.println(rs.getString("empname"));
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}