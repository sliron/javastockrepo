package com.liron.javacourse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyNewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			response.setContentType("text/html");
			double radius = 50;
			double area = Math.PI * Math.pow(radius, 2);
			response.getWriter().println("Area of circle with radius " + radius + " is " + area + " square-cm");
			response.getWriter().println("<br>");
			response.getWriter().println("<br>");
			
			double bDeg = 30;
			double bRad = Math.toRadians(bDeg);
			double ab = 50; // This is the Hypotenuse 
			double opposite = Math.sin(bRad) * ab;
			response.getWriter().println("Length of opposite where angle B is 30 degrees and Hypotenuse "
					+ "length is 50 cm is: " + opposite + " cm");
			response.getWriter().println("<br>");
			response.getWriter().println("<br>");
		
			double result = Math.pow(20, 13);			
			response.getWriter().println("Power of 20 with exp 13 is " + result);
			
			
		
	}
	

}
