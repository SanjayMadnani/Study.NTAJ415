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
		pw.print("<b>some bold text </b><h1>" + new Date() + "</h1>");
		
		pw.print("<br>Current Servlet class object hashcode:: <b>" + this.hashCode() + "</b>");
		pw.print("<br>Request object hashcode:: <b>" + req.hashCode() + "</b>");
		pw.print("<br>Response object hashcode:: <b>" + res.hashCode() + "</b>");
		pw.print("<br>Current object thread hashcode:: <b>" + Thread.currentThread().hashCode() + "</b>");
		pw.print("<br>Current object thread Name:: <b>" + Thread.currentThread().getName() + "</b>");
		
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		res.setIntHeader("refresh", 5);
		pw.close(); 
	}

}
