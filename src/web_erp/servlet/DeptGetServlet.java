package web_erp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_erp.dto.Department;
import web_erp.service.DeptService;


@WebServlet("/DeptGetServlet")
public class DeptGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DeptService service;

    public DeptGetServlet() {
    	service = new DeptService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		int no = Integer.parseInt(request.getParameter("no").trim());
		
		Department dept = service.showDepartment(new Department(no));
		
		request.setAttribute("dept", dept);
		request.getRequestDispatcher("deptInfo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
