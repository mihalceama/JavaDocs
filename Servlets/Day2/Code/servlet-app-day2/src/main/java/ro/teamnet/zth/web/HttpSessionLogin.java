package ro.teamnet.zth.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alexandra.Mihalcea on 7/19/2017.
 */
public class HttpSessionLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//     super.doPost(req, resp);
     String user = req.getParameter("username");
     String password = req.getParameter("password");
//     Cookie[] cookie = req.getCookies();
     if (user.equals("admin") && password.equals("admin")) {
         resp.getWriter().write("Welcome back " + user + " ! Your ID session is " + req.getRequestedSessionId());

     } else{

        req.getSession().setAttribute("username", user);
        req.getSession().setAttribute("session", req.getSession());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/loginFail.jsp");
        requestDispatcher.forward(req, resp);
     }

    }
}
