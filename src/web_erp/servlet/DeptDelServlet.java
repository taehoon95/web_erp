package web_erp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_erp.service.DeptService;


@WebServlet("/DeptDelServlet")
public class DeptDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DeptService service;
	
    public DeptDelServlet() {
    	service = new DeptService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no").trim());
		
		service.delDept(no);
		
		response.sendRedirect("DeptListServlet");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
