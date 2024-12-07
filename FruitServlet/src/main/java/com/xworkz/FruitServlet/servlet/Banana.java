package com.xworkz.FruitServlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/cherry")
public class Banana extends HttpServlet {

    public Banana() {

        System.out.println("This is no arg constructor of cherry class");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String farmerName = req.getParameter("FarmerName");

        String quantity = req.getParameter("quantity");

        String price = req.getParameter("price");

        System.out.println("Farmer Name :" + farmerName);

        System.out.println("Quantity : " + quantity);

        System.out.println("Price : " + price);

        double priceOfCherry = Double.parseDouble(price);
        int cherryQuantity = Integer.parseInt(quantity);

        double totalPrice = priceOfCherry * cherryQuantity;

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("Total price for the " + quantity + " Bananas : rupees " + totalPrice);
    }
}
