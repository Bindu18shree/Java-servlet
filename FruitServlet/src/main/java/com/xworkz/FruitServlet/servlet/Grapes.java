package com.xworkz.FruitServlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/grapes")
public class Grapes extends HttpServlet {

    public Grapes() {

        System.out.println("This is no arg constructor of grapes class..");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String shopName = req.getParameter("shop");
        String owner = req.getParameter("owner");
        String rent = req.getParameter("rent");
        String gst = req.getParameter("gst");
        String address = req.getParameter("address");
        String openTiming = req.getParameter("openTime");
        String closeTiming = req.getParameter("closeTime");
        String worker1 = req.getParameter("worker1");
        String worker2 = req.getParameter("worker2");
        String worker3 = req.getParameter("worker3");
        String worker4 = req.getParameter("worker4");
        String worker5 = req.getParameter("worker5");

        System.out.println("Shop Name : " + shopName);
        System.out.println("Owner Name : " + owner);
        System.out.println("Shop rent : " + rent);
        System.out.println("Gst number of the shop : " + gst);
        System.out.println("Shop Address : " + address);
        System.out.println("Shop opens at : " + openTiming);
        System.out.println("Shop closes at : " + closeTiming);
        System.out.println("Worker 1 : " + worker1);
        System.out.println("Worker 2 : " + worker2);
        System.out.println("Worker 3 : " + worker3);
        System.out.println("Worker 4 : " + worker4);
        System.out.println("Worker 5 : " + worker5);

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("Shop Name : " + shopName + " ; Owner Name : " + owner + " ; Shop rent : " + rent + " ; Gst number of the shop : " + gst +
                " ; Shop Address : " + address + " ; Shop opens at : " + openTiming + " ; Shop closes at : " + closeTiming + " ; Worker 1 : " + worker1 +
                " ; Worker 2 : " + worker2 + " ; Worker 3 : " + worker3 + " ; Worker 4 : " + worker4 + " ; Worker 5 : " + worker5);
    }

}
