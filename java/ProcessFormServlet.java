import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/processForm")
public class ProcessFormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get form parameters from request
        String name = request.getParameter("name");
        String email = request.getParameter("email");
       // String message = request.getParameter("message");

        // Prepare response content
     
        response.getWriter().println("Name:"+ name);
        response.getWriter().println("Email :"+ email);
       
    }
}
