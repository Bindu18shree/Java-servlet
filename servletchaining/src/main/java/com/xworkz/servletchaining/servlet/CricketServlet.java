package com.xworkz.servletchaining.servlet;

import com.xworkz.servletchaining.dto.CricketDto;
import com.xworkz.servletchaining.service.CricketService;
import com.xworkz.servletchaining.service.CricketServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/cricket")
public class CricketServlet extends HttpServlet {

    private CricketService cricketService = new CricketServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        String format = req.getParameter("format");
        String status = req.getParameter("status");
        int prizeMoney = Integer.parseInt(req.getParameter("prize"));
        int noOfTeams = Integer.parseInt(req.getParameter("team"));

        CricketDto cricketDto = new CricketDto(name, location, startDate,endDate, format,status, prizeMoney, noOfTeams);

        boolean result = cricketService.save(cricketDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("cricket.jsp");
        req.setAttribute("cricket", cricketDto);

        if (result==true){

            req.setAttribute("Message", "Tournament Name : " +name+ " Location " +location+ " ; Start Date - " +startDate+ " ; End Date - "+endDate+ " ; Format - " +format+ " ; Status - " +status+ " ; Prize Money - "  +prizeMoney+ " ; Number of Teams - " +noOfTeams
            );
        }
        else {
            req.setAttribute("Message", "not saved");
        }
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Running getAll in cricket Servlet");

        List<CricketDto> listOfCricketDto = this.cricketService.getAll();

        req.setAttribute("list",listOfCricketDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("cricketResult.jsp");
        requestDispatcher.forward(req,resp);

    }
}
