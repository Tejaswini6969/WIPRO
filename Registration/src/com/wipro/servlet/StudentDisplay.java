package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.StudentBean;

/**
 * Servlet implementation class StudentDisplay
 */
@WebServlet("/StudentDisplay")
public class StudentDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StudentBean sb=(StudentBean)req.getAttribute("studentbean");
		PrintWriter pw=resp.getWriter();
		try {
		pw.print("<h1> Welcome to Student information <h1>");
		pw.println("Name of the Student: "+sb.getName()+"<br>");
		pw.println("Email of the Student:"+sb.getEmail()+"<br>");
		pw.println("RegNo of the Student:"+sb.getRegno());
		}
		finally {
			pw.close();
		}
	}

}
