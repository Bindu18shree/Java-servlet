package com.xworkz.servletchaining.servlet;

import com.xworkz.servletchaining.dto.MuseumTicketDto;
import com.xworkz.servletchaining.service.MuseumService;
import com.xworkz.servletchaining.service.MuseumServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/museum")
public class MuseumTicketServlet extends HttpServlet {

    private MuseumService museumService =new MuseumServiceImpl();

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

        boolean result = museumService.save(museumTicketDto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("museumTicket.jsp");

        if (result){

            req.setAttribute("Message", "Person with name " +name+ " has confirmed "  +noOfAdults+ " adult tickets and " +noOfChildren+ " children tickets. Contact Number : "+mobileNo+ " and email : " +email+ " and total cost of the tickets : " +totalCost);
        }
        else {
            req.setAttribute("Message", "not saved");
        }


        req.setAttribute("Museum", museumTicketDto);

        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("running doGet in MuseumTicketServlet");

        List<MuseumTicketDto> listOfMuseumTicket = this.museumService.getAll();

        req.setAttribute("list",listOfMuseumTicket);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("museumResult.jsp");
        requestDispatcher.forward(req,resp);
    }
}
