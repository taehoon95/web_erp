package web_erp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_erp.service.EmpService;


@WebServlet("/EmpDelServlet")
public class EmpDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmpService service;
	
    public EmpDelServlet() {
    	service = new EmpService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("empNo").trim());
		
		service.delEmp(no);
		
		response.sendRedirect("EmpListServlet");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
