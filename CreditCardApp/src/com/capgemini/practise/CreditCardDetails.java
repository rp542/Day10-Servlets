package com.capgemini.practise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/creditcard")
public class CreditCardDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CreditCardDetails() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String cardnumber = request.getParameter("cardnumber");

		String expirydate = request.getParameter("expirydate");
		String cvv = request.getParameter("cvv");
		
		out.println("<h3>Employee Name: "+name+  "</h3><h3>Card Number: "+cardnumber+"</h3><h3>Expiry Date: "+expirydate+"</h3><h3>CVV: "+cvv+"</h3>");
		out.println("<h3><a href='details.html'>Next User</a></h3>");


	}

}
