package com.xworkz.servletchaining.servlet;

import com.xworkz.servletchaining.dto.CricketDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cricket")
public class CricketServlet extends HttpServlet {

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

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("cricketResult.jsp");

        req.setAttribute("cricket", cricketDto);

        requestDispatcher.forward(req,resp);


    }
}
