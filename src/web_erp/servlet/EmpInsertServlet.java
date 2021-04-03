package web_erp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_erp.dto.Department;
import web_erp.dto.Employee;
import web_erp.dto.Title;
import web_erp.service.EmpService;


@WebServlet("/EmpInsertServlet")
public class EmpInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmpService service;

    public EmpInsertServlet() {
    	service = new EmpService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int empNo = Integer.parseInt(request.getParameter("empNo"));
		String empName = request.getParameter("empName");
		int salary = Integer.parseInt(request.getParameter("salary"));
		int title = Integer.parseInt(request.getParameter("title"));
		int manager = Integer.parseInt(request.getParameter("manager"));
		int dept = Integer.parseInt(request.getParameter("dept"));
		
		Employee employee = new Employee(empNo, empName, new Title(title), new Employee(manager), salary,new Department(dept));
		
		service.addEmp(employee);
		
		response.sendRedirect("EmpListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
