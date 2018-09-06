package com.capgemini.domain;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employeedetails")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Employee> employee = new ArrayList<>();

	public EmployeeServlet() {
		super();

	}

	@Override
	public void init() throws ServletException {

		employee.add(new Employee(157817, "priyanka", 12000.0, "Corp"));
		employee.add(new Employee(157857, "Amrin", 13000.0, "Corp"));
		employee.add(new Employee(157868, "Divya", 11000.0, "FI"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String employeeid = request.getParameter("employeeid");
		int employeeid1 = Integer.parseInt(employeeid);
		int count = 0;
		for (Employee e : employee) {
			if (e.getEmployeeid() == employeeid1) {
				count = 1;
				out.println(
						"<table border=1><tr><th>EmployeeName</th><th>Employeesalary</th><th>EmployeeDepartment</th></tr>");
				out.println("<tr><td>" + e.getEmpName() + "</td><td>" + e.getSalary() + "</td><td>" + e.getEmpDept()
						+ "</td></tr></table>");

			}

		}
		if (count == 0)

		{
			out.println("<h3>User doesnot exists</h3>");
			out.println("<br><br><a href='employee.html'>Try Again</a>");
		}
	}

}
