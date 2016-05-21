package pe.edu.utp.helloWebProfiles.viewController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by ORACLE on 21/05/2016.
 */
@WebServlet(name = "DateServlet", urlPatterns = "/date" )
public class DateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.sayWelcome( request, response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.sayWelcome( request, response );
    }

    private void sayWelcome( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println( "<h1>This day is</h1>" );
        out.println( new Date().toString());
    }
}
