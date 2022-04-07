package com.servlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyHelloServlet  extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.getWriter().println("Hello World!  *********  ********* !");
	}

}
