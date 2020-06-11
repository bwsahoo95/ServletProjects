package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=null;
		String name=null,gender=null;
		int age=0;
		pw=res.getWriter();
		res.setContentType("text/html");
		name=req.getParameter("pname");
		age=Integer.parseInt(req.getParameter("page"));
		gender=req.getParameter("gender");
		
		if(gender.equalsIgnoreCase("M")) {
			if(age>=18) {
				pw.println("<h1 style='color:green;text-align:center'> Mr." +name+ " you are eligible to marry</h1>");
			}
			else
				pw.println("<h1 style='color:red;text-align:center'> Mr." +name+ " you are not eligible to marry</h1>");
		}
		else if(gender.equalsIgnoreCase("F")) {
			if(age>=18) {
				pw.println("<h1 style='color:green;text-align:center'> Mrs." +name+ " you are eligible to marry</h1>");
			}
			else
				pw.println("<h1 style='color:red;text-align:center'> Mrs." +name+ " you are not eligible to marry</h1>");
		}
		else
			pw.println("<h1 style='color:gold;text-align:center'>Unidentified Gender</h1>");
		
		pw.println("<p>Date & Time :"+new Date()+"</p>");
		
		pw.println("<br><a href='http://localhost:2030/MarriageApp/home.html'><img src='images/home_logo.png' width='50' height='50'></a>");
		
		pw.close();
		
	}

}
