

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FactorialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int number = Integer.parseInt(request.getParameter("number"));
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        out.println("<html><body>");
        out.println("<h2>Factorial Result</h2>");
        out.println("<p>Factorial of " + number + " is: <strong>" + fact + "</strong></p>");
        out.println("</body></html>");
    }
}
