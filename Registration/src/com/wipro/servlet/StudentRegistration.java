package com.wipro.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.StudentBean;
import com.wipro.dao.StudentDAO;

/**
 * Servlet implementation class StudentRegistration
 */
@WebServlet("/StudentRegistration")
public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistration() {
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
		/*String no=req.getParameter("no");
		PrintWriter pw=resp.getWriter();
		pw.print(no);*/
		StudentBean st=new StudentBean();
		st.setRegno(Integer.parseInt(req.getParameter("no")));
		st.setName(req.getParameter("name"));
		st.setEmail(req.getParameter("mail"));
		StudentDAO sd=new StudentDAO();
		try {
		int validate=sd.StudentInsert(st);
		if(validate>0)
		{
			req.setAttribute("studentbean",st);
			RequestDispatcher rd=req.getRequestDispatcher("StudentDisplay");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("fail.html");
			rd.include(req, resp);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
