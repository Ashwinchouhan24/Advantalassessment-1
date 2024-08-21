import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("index.jsp");
        HttpSession hs = req.getSession();
        int n = (int)hs.getAttribute("one");
        PrintWriter p = resp.getWriter();
        p.print("the session attribute is : " + n);
}
}
  