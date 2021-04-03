package web_erp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_erp.dto.Department;
import web_erp.service.DeptService;


@WebServlet("/DeptListServlet")
public class DeptListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DeptService service;
	
	
    public DeptListServlet() {
    	service = new DeptService();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Department> list = service.showDepartments();
		list.stream().forEach(System.out::println);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("deptList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
