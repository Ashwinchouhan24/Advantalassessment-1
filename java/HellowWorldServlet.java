import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class HellowWorldServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html");
        
        
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}