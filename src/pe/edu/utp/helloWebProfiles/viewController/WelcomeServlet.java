package pe.edu.utp.helloWebProfiles.viewController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ORACLE on 21/05/2016.
 */

//Anotacion de Java
@WebServlet(name = "WelcomeServlet", urlPatterns = "/welcome" )
public class WelcomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.sayWelcome( request, response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.sayWelcome( request, response );
    }
    private void sayWelcome( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        //response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        //String objectToReturn = "{ key1: 'value1', key2: 'value2' }";

        out.println( "<h1>Web Profile App</h1>" );
        out.println( "<p>Welcome to your first webb profile Application</p>" );
        //out.print( objectToReturn );
    }
}
