package com.xworkz.servletchaining.servlet;

import com.xworkz.servletchaining.dto.MuseumTicketDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/museum")
public class MuseumTicketServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int adultCost = 200;
        int childrenCost = 100;

        String name= req.getParameter("name");
        int noOfAdults = Integer.parseInt(req.getParameter("adults"));
        int noOfChildren = Integer.parseInt(req.getParameter("children"));
        long mobileNo = Long.parseLong(req.getParameter("number"));
        String email = req.getParameter("email");

        double totalCost = (noOfAdults * adultCost) + (noOfChildren * childrenCost);

        MuseumTicketDto museumTicketDto =  new MuseumTicketDto(name, noOfAdults, noOfChildren, mobileNo, email, totalCost);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("museumTicket.jsp");

        req.setAttribute("Museum", museumTicketDto);

        requestDispatcher.forward(req,resp);

    }
}
