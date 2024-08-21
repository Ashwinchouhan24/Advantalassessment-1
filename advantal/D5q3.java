
package advantal;
import java.sql.*;
public class D5q3  {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Employee";
            String username = "root";
            String pass = "ashu@123";
            con = DriverManager.getConnection(url, username , pass );
            Statement s=con.createStatement();
            String q = " create table IF NOT EXISTS employee1(id INT NOT NULL PRIMARY KEY, ename VARCHAR(255), branch VARCHAR(255))";
            String q1 = "insert into employee1(id, ename, branch) values(8 , 'john', 'New York'), (11 , 'tom', 'Paris')";
            s.execute(q);
            s.executeUpdate(q1);
            System.out.println("-----before deletion-------");
            ResultSet r = s.executeQuery("select * from employee1");
            while(r.next()){
                System.out.println(r.getInt("id") + " " + r.getString("ename") + " " + r.getString("branch"));
            }
            String q2 = "delete from employee1 where id=6";
            s.execute(q2);
            System.out.println("-----After deletion-------");
            r = s.executeQuery("select * from employee1");
            while(r.next()){
                System.out.println(r.getInt("id") + " " + r.getString("ename") + " " + r.getString("branch"));
            }
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