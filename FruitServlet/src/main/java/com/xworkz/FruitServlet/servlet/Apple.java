package com.xworkz.FruitServlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/second")
public class Apple extends HttpServlet {

    public Apple() {

        System.out.println("This is no arg constructor of Apple class");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String type = req.getParameter("type");
        String grown = req.getParameter("grown");
        String imported = req.getParameter("imported");
        String color = req.getParameter("color");
        String price = req.getParameter("price");

        System.out.println("Type of apple :" + type);
        System.out.println("Grown in :" + grown);
        System.out.println("Imported :" + imported);
        System.out.println("color :" + color);
        System.out.println("Price :" + price);

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("Type of apple : " +type+ " ; Grown in : "+grown+ " ; Imported : "+imported+ " ; Color : "+color+ " ; Price per kg : " +price);



    }
}
