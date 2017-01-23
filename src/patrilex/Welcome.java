// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8


/**
Class Welcome

Displays the help file for the search.

*/

package patrilex;


// Servlets
import javax.servlet.*;
import javax.servlet.http.*;

// IO
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


/** Displays the help for the search */
public class Welcome extends HttpServlet {
   
   
   /** 
      Method doGet
   
      Displays a short welcome.
   */
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {

      response.setContentType("text/html; charset=UTF-8");

      PrintWriter out = new PrintWriter(
         new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
       
      try {
         out.println("<html>");
         out.println("<head>");
         out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />");
         out.println("<link rel=stylesheet type=\"text/css\" href=\"content.css\">");
         out.println("<title>Patrilex Web Search Engine</title>");
         out.println("</head>");
         out.println("<body>");
         out.println("<h1>Patrilex Multilngual Search Engine</h1>");
         out.println("<p>You have successfully installed the Patrilex multilingual search engine.</p>");
         out.println("</body>");
         out.println("</html>");

         
      } catch (Exception e) {
         out.println("<br><br><br><font color=red>"); 
         out.println("AN ERROR OCURRED: ");
         out.println(e.getMessage()); 
         e.printStackTrace(out);
         out.println("</font><br>");
         out.println("</body>");
         out.println("</html>");
      }
    }


   /** 
      Method doPost
   
      Calls on doGet.
   */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
      doGet(request, response);
    }

}
