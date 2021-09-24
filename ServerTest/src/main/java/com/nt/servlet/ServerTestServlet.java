package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServerTestServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
//		res.setContentType("text/plain");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<b>some bold text:: </b>" + new Date());
		res.setIntHeader("refresh", 5);
		pw.close(); 
	}

}
