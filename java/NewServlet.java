import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.*;
import javax.servlet.http.HttpSession;
public class NewServlet extends HttpServlet {

     protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        Connection con = null ;
        List<String> lst = new ArrayList<>();
        PrintWriter pr = resp.getWriter();
        try{
            System.out.println("try");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Employee";
            String username = "root";
            String pass = "ashu@123";
            con = DriverManager.getConnection(url, username , pass );
            con.setAutoCommit(true);
            Statement st = con.createStatement();
            ResultSet rs = st.executeUpdate("select ename from employee");
            while(rs.next()){
                lst.add(rs.getString("ename"));
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
        HttpSession hs = req.getSession();
        hs.setAttribute("name", lst);
        resp.sendRedirect("newjsp.jsp");
     }
}
