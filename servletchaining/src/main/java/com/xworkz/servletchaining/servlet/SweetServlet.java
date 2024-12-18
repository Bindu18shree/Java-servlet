package com.xworkz.servletchaining.servlet;

import com.xworkz.servletchaining.dto.SweetDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/sweet")
public class SweetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, Double> map = new HashMap<String, Double>();

        map.put("Kaju Katli", 800.0);
        map.put("Dry Fruit Ladoo", 900.0);
        map.put("Kaju Pine", 850.0);
        map.put("Anjeer Dry Fruit Roll", 950.0);
        map.put("Anjeer Sandwich", 1050.0);
        map.put("Coconut Burfi", 650.0);


        String shopName = req.getParameter("shopName");
        String sweetName = req.getParameter("sweetName");
        boolean isSpecial = Boolean.parseBoolean(req.getParameter("isSpecial"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        double pricePerKg = map.get(sweetName);
        double basePrice = (quantity / 1000.0)* pricePerKg;

        double extraChargePerKg = isSpecial ? 30.0 : 0.0; // Extra charge for special sweets
        double totalExtraCharge = (quantity / 1000.0) * extraChargePerKg;

        double totalPrice = basePrice + totalExtraCharge;


        SweetDto sweetDto = new SweetDto(shopName, sweetName, isSpecial,quantity,totalPrice);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("sweetResult.jsp");

        req.setAttribute("Sweet", sweetDto);

        requestDispatcher.forward(req,resp);

    }
}
