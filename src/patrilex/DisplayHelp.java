// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8


/**
Class DisplayHelp

Displays the help file for the search.

*/

package patrilex;


// Servlets
import javax.servlet.*;
import javax.servlet.http.*;

// IO and Exceptions
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;


/** Displays the help for the search */
public class DisplayHelp extends HttpServlet {
   
   private static String helpfile = "html/help.html";
   
   /** 
      Method printHTML
   
      Prints the contents of a file that is supposed to be HTML.
      There is no checking of the HTML so it could contain anything!
   */
   private static void printHTML (String path, PrintWriter out) {
      try {
         
         /*
            Open file and deal with a lot of exceptions
         */

         File file = new File (path);
         if (file == null) { // File is null
            throw new IllegalArgumentException ("File should not be null!");
         }
         if (!file.exists()) { // File doesn't exist
            throw new FileNotFoundException ("File does not exist: " + file);
         }
         if (!file.isFile()) { // File is a directory
            throw new IllegalArgumentException ("File is a directory: " + file);
         }
      
         /*
            Print the contents of the file
         */
         
         BufferedReader inputFile = new BufferedReader(new FileReader(file));
         String line = null;
         while  (( line = inputFile.readLine()) != null) {
            out.println(line);
         }
         
      } catch (Exception e) {
         out.println("<br><br><br><font color=red>"); 
         out.println("AN ERROR OCURRED: ");
         out.println(e.getMessage()); 
         e.printStackTrace(out);
         out.println("</font>");
      }
   }
   

   /** 
      Method doGet
   
      Main method, displays the helpfile with header and footer.
   */
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {

      response.setContentType("text/html; charset=UTF-8");
      Constants c = new Constants();

      PrintWriter out = new PrintWriter(
         new OutputStreamWriter(response.getOutputStream(), "UTF8"), true);
       
      try {
         String filePath2 = request.getSession().getServletContext().getRealPath("/") + File.separator + helpfile;
         
         String filePath = c.getHtmlRoot() + File.separator + c.getHeaderfile();
         printHTML (filePath, out);
         
         printHTML (filePath2, out);
         
         filePath = c.getHtmlRoot() + File.separator + c.getFooterfile();
         printHTML (filePath, out);
         
      } catch (Exception e) {
         out.println("<br><br><br><font color=red>"); 
         out.println("AN ERROR OCURRED: ");
         out.println(e.getMessage()); 
         e.printStackTrace(out);
         out.println("</font><br>");
         String filePath = c.getHtmlRoot() + File.separator + c.getFooterfile();
         printHTML (filePath, out);
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
