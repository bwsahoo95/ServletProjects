package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("RegistrationServlet.doGet()");
		PrintWriter pw=null;
		String name=null,addrs=null,gender=null,marry=null,qlfy=null,courses[]=null,hobby[]=null,fb=null,mail=null,dob=null,color=null;
		int age=0;
		long phone=0L,sal=0L;
		//getting the PrintWriter stream
		pw=res.getWriter();
		//set Content Type
		res.setContentType("text/html");
		//getting the req param values
		name=req.getParameter("pname");
		age=Integer.parseInt(req.getParameter("age"));
		addrs=req.getParameter("addrs");
		gender=req.getParameter("gender");
		phone=Long.parseLong(req.getParameter("phone"));
		marry=req.getParameter("marry");
		qlfy=req.getParameter("qlfy");
		courses=req.getParameterValues("crs");
		if(courses==null)
	    	 courses=new String[] {"no courses"};
		hobby=req.getParameterValues("hobby");
		if(hobby==null)
	    	 hobby=new String[] {"no hobby"};
		fb=req.getParameter("fb");
		mail=req.getParameter("mail");
		color=req.getParameter("col");
		sal=Long.parseLong(req.getParameter("sal"));
		dob=req.getParameter("dob");
		
		//B.logic for the form
		pw.println("<body background='images/background.jpg'>");
		pw.println("<h1 style='text-align:center;color:DARKBLUE'>FORM DETAILS ARE<h1>");
		pw.println("<table align='center' border='1px solid black'>");
		pw.println("<tr><td><font color='DARKBLUE'>Name :</font></td>"
				+ "<td>"+name+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Age :</font></td>"
				+ "<td>"+age+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Date Of Birth :</font></td>"
				+ "<td>"+dob+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Gender :</font></td>"
				+ "<td>"+gender+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Address :</font></td>"
				+ "<td>"+addrs+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Phone No. :</font></td>"
				+ "<td>"+phone+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Marital Status :</font></td>"
				+ "<td>"+marry+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Qualification :</font></td>"
				+ "<td>"+qlfy+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Courses Interest :</font></td>"
				+ "<td>"+Arrays.toString(courses)+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Hobbies :</font></td>"
				+ "<td>"+Arrays.toString(hobby)+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Facebook url :</font></td>"
				+ "<td>"+fb+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Mail ID :</font></td>"
				+ "<td>"+mail+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Favourite Color :</font></td>"
				+ "<td>"+color+"</td></tr>");
		pw.println("<tr><td><font color='DARKBLUE'>Expected Salary :</font></td>"
				+ "<td>"+sal+"</td></tr>");
		pw.println("</table><br><br>");
		
		//condition check
		 if(gender.equalsIgnoreCase("M")) {
	    	 if(age<=5)
	    		 pw.println("<p align='center'><font size='4' color='green'>Master. "+name+" you are baby boy</font></p>");
	    	 else if(age<=12)
	    		 pw.println("<p align='center'><font size='4' color='green'>Master. "+name+" you are small boy</font></p>");
	    	 else if(age<=19)
	    		 pw.println("<p align='center'><font size='4' color='green'>Mr. "+name+" you are teen boy</font></p>");
	    	 else if(age<=35)
	    		 pw.println("<p align='center'><font size='4' color='green'>Mr. "+name+" you are young man</font></p>");
	    	 else if(age<=50)
	    		 pw.println("<p align='center'><font size='4' color='green'>Mr. "+name+" you are middle-aged man</font></p>");
	    	 else
	    		 pw.println("<p align='center'><font size='4' color='green'>Mr. "+name+" you are old man</font></p>");
	     }
	     else {
	    	 if(age<=5)
	    		 pw.println("<p align='center'><font size='4' color='green'>Master. "+name+" you are baby girl</font></p>");
	    	 else if(age<=12)
	    		 pw.println("<p align='center'><font size='4' color='green'>Miss. "+name+" you are small girl</font></p>");
	    	 else if(age<=19) {
	    		if(marry.equalsIgnoreCase("um"))
	    			pw.println("<p align='center'><font size='4' color='green'>Miss. "+name+" you are teen girl</font></p>");
	    	     else
	    	    	 pw.println("<p align='center'><font size='4' color='green'>Mrs. "+name+" you are married young woman</font></p>");
	    	     	 }
	    	 else if(age<=35) {
	    		 if(marry.equalsIgnoreCase("um"))
	    			 pw.println("<p align='center'><font size='4' color='green'>Miss. "+name+" you are young woman</font></p>");
	    	     else
	    	    	 pw.println("<p align='center'><font size='4' color='green'>Mrs. "+name+" you are married woman</font></p>");
	    	 }
	    		 else if(age<=50) {
	    			 if(marry.equalsIgnoreCase("ma"))
	    				 pw.println("<p align='center'><font size='4' color='green'>Mrs. "+name+" you are married middle-aged woman</font></p>");
		    	     else
		    	    	 pw.println("<p align='center'><font size='4' color='green'>Miss. "+name+" you are un-married middle-aged woman</font></p>");
	    		 }
	    		 else {
	    			 if(marry.equalsIgnoreCase("ma"))
	    				 pw.println("<p align='center'><font size='4' color='green'>Miss. "+name+" you are married old woman</font></p>");
		    	     else
		    	    	 pw.println("<p align='center'><font size='4' color='green'>Miss. "+name+" you are un-married old woman</font></p>");
	    		 }
	     }
		 pw.println("<p align='center'><a href='home.html'><img src='images/home_logo.png' width='50' height='50'></a></p>");
		 pw.println("</body>");
			
			//close stream
			pw.close();
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("RegistrationServlet.doPost()");
		doGet(req,res);
	}

}
