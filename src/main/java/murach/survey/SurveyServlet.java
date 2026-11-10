package murach.survey;

import murach.business.User;
import murach.business.Survey;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.time.LocalDate;

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
            User user = new User(firstName, lastName, email, LocalDate.parse(birthday));

            String hearAbout = request.getParameter("hearAbout");
            String receiveAnnouncements = request.getParameter("receiveAnnouncements");
            String receiveOffers = request.getParameter("receiveOffers");
            String contactType = request.getParameter("contactType");
            Boolean announcements = receiveAnnouncements != null;
            Boolean offers = receiveOffers != null;
            Survey survey = new Survey(user, hearAbout, announcements, offers, contactType);

            request.setAttribute("survey", survey);
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
