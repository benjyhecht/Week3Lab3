package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 468181
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageString = request.getParameter("age");
        String message = new String();
        int age = 0;
                
        if (ageString == null || ageString.equals(""))
        {
            message = "You must give your current age";
        }
        else
        {
            try
            {
                age = Integer.parseInt(ageString);
                message = "Your age next birthday will be " + (age + 1);
            }
            catch (Exception e)
            {
                message = "You must enter a number";
            }
        }

        
        request.setAttribute("ageMessage", message);        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
    }

}
