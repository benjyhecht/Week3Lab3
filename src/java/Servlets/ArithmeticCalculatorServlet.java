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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("answerMessage", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstString = request.getParameter("first");
        String secondString = request.getParameter("second");
        String calculation = request.getParameter("submit");
        String message = new String();
        int first = 0;
        int second = 0;
        int answer = 0;
        
        request.setAttribute("first", firstString);
        request.setAttribute("second", secondString);
                
        if (firstString == null || firstString.equals("") || secondString == null || secondString.equals(""))
        {
            message = "invalid";
        }
        else
        {
            try
            {
                first = Integer.parseInt(firstString);
                second = Integer.parseInt(secondString);
                if (calculation.equals("+"))
                {
                    answer = first + second;
                }
                else if (calculation.equals("-"))
                {
                    answer = first - second;
                }
                else if (calculation.equals("*"))
                {
                    answer = first * second;
                }
                else
                {
                    answer = first % second;
                }
                message = "Result: " + answer;
            }
            catch (Exception e)
            {
                message = "invalid";
            }
        }
        
        request.setAttribute("answerMessage", message);        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
    }

}
