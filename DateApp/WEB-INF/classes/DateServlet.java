package com.nt.servlet;

import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class DateServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Date dt = new Date();
		pw.println("<h1>Date and Time is:: " + dt + "</h1>");
		pw.close();
	}
}