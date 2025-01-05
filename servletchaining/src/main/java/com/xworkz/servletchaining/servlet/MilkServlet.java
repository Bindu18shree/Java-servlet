package com.xworkz.servletchaining.servlet;

import com.xworkz.servletchaining.dto.MilkDto;
import com.xworkz.servletchaining.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/milk")
public class MilkServlet extends HttpServlet {

    private MilkService milkService = new MilkServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, Double> map = new HashMap<String, Double>();

        map.put("Special", 56.0);
        map.put("Ordinary", 54.0);
        map.put("Good Life", 67.0);
        map.put("Good Life Lite", 68.0);
        map.put("Family", 56.0);
        map.put("Buffalo Milk", 70.0);


        String brand = req.getParameter("brand");
        String type = req.getParameter("milkType");
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        double pricePerLitre = map.get(type); // Price for 1 litre
        double pricePerHalfLitre = pricePerLitre / 2; // Price for half litre
        double pricePer250Ml = pricePerHalfLitre / 2; // Price for 0.25 litre

        double totalPrice = 0.0;

        if (quantity == 250) {
            totalPrice = pricePer250Ml;
        } else if (quantity == 500) {
            totalPrice = pricePerHalfLitre;
        } else {
            totalPrice = (quantity / 1000.0) * pricePerLitre;
        }

        MilkDto milkDto = new MilkDto(brand, type, quantity, totalPrice);

        boolean result = milkService.save(milkDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("milk.jsp");

        if (result) {
            req.setAttribute("Message", "Milk of brand " + brand + " and type : " + type + " with quantity : " + quantity + " ml  ; costs : " + totalPrice + " rupees Ordered Successfully.");
        } else {
            req.setAttribute("Message", "not saved");
        }

        req.setAttribute("Milk", milkDto);

        requestDispatcher.forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("running doGet in MilkServlet");


        List<MilkDto> listOfMilkDto = this.milkService.getAll();
        req.setAttribute("list", listOfMilkDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/MilkResult.jsp");
        requestDispatcher.forward(req, resp);

    }
}
