package com.example.getinitparameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GetInitializationParameterServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");

		PrintWriter out = resp.getWriter();
		ServletConfig config = getServletConfig();

		String driver = config.getInitParameter("driver");

		out.println("Driver is " + driver);

		out.close();
	}
}
