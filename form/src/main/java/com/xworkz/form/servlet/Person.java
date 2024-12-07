package com.xworkz.form.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/person")
public class Person extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String number = req.getParameter("number");
        String email = req.getParameter("email");
        String message = req.getParameter("message");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<head>");
        printWriter.println("<style>");
        printWriter.println("  .response { color: green;}");
        printWriter.println("  .underline { text-decoration: underline; }");
        printWriter.println("</style>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<p class='response'>Name: <span class='underline'>" + name + "</p>");
        printWriter.println("<p class='response'>Contact Number: " + number + "</p>");
        printWriter.println("<p class='response'>Email: " + email + "</p>");
        printWriter.println("<p class='response'>Message: " + message + "</p>");
        printWriter.println("<img src = 'https://static.vecteezy.com/system/resources/thumbnails/033/161/655/small/ai-generated-cute-little-girl-holding-a-bouquet-of-flowers-in-mothers-day-international-womens-day-st-valentines-day-concept-copy-space-photo.jpg'>");
        printWriter.println("</body>");
        printWriter.println("</html>");

    }
}
