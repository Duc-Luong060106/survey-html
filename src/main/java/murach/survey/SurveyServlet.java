package murach.survey;

import murach.business.User;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SurveyServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";
        String action = request.getParameter("action");
        if(action == null) {
            action = "join";
        }

        if (action.equals("join")) {
            url = "/index.html";
        }
        else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String birthday = request.getParameter("birthday");
            User user = new User(firstName, lastName, email, birthday);
            request.setAttribute("user", user);

            String hearAbout = request.getParameter("hear_about");
            String emailOK1 = request.getParameter("emailOK1");
            String emailOK2 = request.getParameter("emailOK2");
            String contactType = request.getParameter("contact_type");

            String receiveNewCDs = (emailOK1 != null) ? "Yes" : "No";
            String receiveSpecialOffers = (emailOK2 != null) ? "Yes" : "No";

            request.setAttribute("hearAbout", hearAbout);
            request.setAttribute("receiveNewCDs", receiveNewCDs);
            request.setAttribute("receiveSpecialOffers", receiveSpecialOffers);
            request.setAttribute("contactType", contactType);
            url = "/thanks.jsp";
        }

        getServletContext()
                .getRequestDispatcher(url).forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
