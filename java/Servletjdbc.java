import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class Servletjdbc extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pr = resp.getWriter();

        String name = req.getParameter("ename");
        String branch = req.getParameter("branch");
        String idParam = req.getParameter("id");

        if (name == null || name.trim().isEmpty() || branch == null || branch.trim().isEmpty() || idParam == null || idParam.trim().isEmpty()) {
            pr.println("Invalid input. All fields are required.");
            req.getRequestDispatcher("index1.jsp").forward(req, resp);
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            pr.println("Invalid ID format. ID must be an integer.");
            req.getRequestDispatcher("index1.jsp").forward(req, resp);
            return;
        }

        Connection con = null;
        PreparedStatement pt = null;

        try {
            System.out.println("Loading JDBC Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to the database with SSL");
            String url = "jdbc:mysql://localhost:3306/Employee?useSSL=false";
            con = DriverManager.getConnection(url, "root", "ashu@123");

            String sql = "INSERT INTO Employee(empid, empname, branch) VALUES (?, ?, ?)";
            pt = con.prepareStatement(sql);
            pt.setInt(1, id);
            pt.setString(2, name);
            pt.setString(3, branch);

            int rowsAffected = pt.executeUpdate();
            if (rowsAffected > 0) {
                pr.println("Inserted Successfully!!!!");
            } else {
                pr.println("Failed to insert record.");
            }

            resp.sendRedirect("index1.jsp"); 

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            pr.println("An error occurred: " + e.getMessage());
            req.getRequestDispatcher("index1.jsp").forward(req, resp);
        } finally {
            try {
                if (pt != null) pt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
