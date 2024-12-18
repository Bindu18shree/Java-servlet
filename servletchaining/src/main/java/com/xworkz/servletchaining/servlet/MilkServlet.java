package com.xworkz.servletchaining.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/milk")
public class MilkServlet extends HttpServlet {

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
        String quantity = req.getParameter("quantity");

        
    }
}
