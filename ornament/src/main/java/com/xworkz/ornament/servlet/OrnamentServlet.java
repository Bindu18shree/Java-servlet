package com.xworkz.ornament.servlet;

import com.xworkz.ornament.dto.OrnamentDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/ornament")
public class OrnamentServlet extends HttpServlet {

    public OrnamentServlet() {

        System.out.println("Running no arg const in ornament servlet class");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String grams = req.getParameter("grams");
        String cost = req.getParameter("cost");
        String gst = req.getParameter("gst");
        String ratings = req.getParameter("rating");

       int convertedGrams=Integer.parseInt(grams);
       double convertedCost=Double.parseDouble(cost);
       int convertedGst=Integer.parseInt(gst);
       double totalCost=(convertedGrams*convertedCost)+convertedGst;
       int convertedRatings=Integer.parseInt(ratings);

        OrnamentDTO ornamentDTO=
                new OrnamentDTO(name,convertedGrams,convertedCost,convertedGst,convertedRatings);

        ornamentDTO.setTotalCost(totalCost);
        RequestDispatcher requestDispatcher =
                req.getRequestDispatcher("ornamentResult.jsp");
        req.setAttribute("ornament",ornamentDTO);

        requestDispatcher.forward(req,resp);
    }

}

