package com.xworkz.FruitServlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/first")
public class Mango extends HttpServlet {

    public Mango() {

        System.out.println("This is no arg constructor of Mango class");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String contact = req.getParameter("contact");
        String email = req.getParameter("email");
        String age = req.getParameter("age");
        String address = req.getParameter("address");
        String pincode = req.getParameter("pincode");
        String fatherName = req.getParameter("father");
        String motherName = req.getParameter("mother");
        String education = req.getParameter("education");
        String specialization = req.getParameter("specialization");
        String university = req.getParameter("university");
        String usin = req.getParameter("usin");
        String universityAddress = req.getParameter("universityAddress");
        String universityPincode = req.getParameter("UniversityPincode");
        String noOfBranches = req.getParameter("branches");
        String dept = req.getParameter("departments");
        String ug = req.getParameter("ug");
        String btech = req.getParameter("btech");
        String bsc = req.getParameter("bsc");
        String bdes = req.getParameter("bdes");
        String pg = req.getParameter("pg");
        String masters = req.getParameter("masters");
        String mtech = req.getParameter("mtech");
        String msc = req.getParameter("msc");
        String universityEmail = req.getParameter("universityEmail");
        String universityContact = req.getParameter("universityContact");
        String admission = req.getParameter("admission");


        PrintWriter printWriter = resp.getWriter();

        printWriter.println("Name of the student : " + name + " ; Contact Number of the Student : " + contact + " ; Email of the student : "
                + email + " ; Age of the student : " + age + " ; Address : " + address + " ; Pincode of the student : " + pincode + " ; Student's Father Name : "
                + fatherName + " ; Student's Mother Name : " + motherName + " ; Qualification of the student : " + education + " ; Specialization : "
                + specialization + " ; University : " + university + " ; USIN of the student : " + usin + " ; Address of the university : "
                + universityAddress + " ; Pincode of the University : " + universityPincode + " ; No of branches of university : " + noOfBranches +
                " ; No of departments in the university : " + dept + " ; UG Programmes offered by university : " + ug + " ; Specializations offered in B.Tech "
                + btech + " ; Specializations offered in B.Sc(Hons) : " + bsc + " ; Specializations offered in B.Des : " + bdes + " ; PG Programmes offered by University : "
                + pg + " ; Specializations offered in Master's of Dental Surgery : " + masters + " ; Specializations offered in M.Tech : " + mtech + " ; Specializations offered in M.sc : "
                + msc + " ; Email of the University : " + universityEmail + " ; Contact Number of the University : " + universityContact + " ; Contact number for the admission purpose : "
                + admission);
    }
}
