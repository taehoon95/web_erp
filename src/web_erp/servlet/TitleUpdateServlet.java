package web_erp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_erp.dto.Title;
import web_erp.service.TitleService;


@WebServlet("/TitleUpdateServlet")
public class TitleUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TitleService service;   
	
    public TitleUpdateServlet() {
    	service = new TitleService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		int no = Integer.parseInt(request.getParameter("no"));
		String name = request.getParameter("name").trim(); 
		
		Title title = new Title(no, name);
		System.out.println(title);
		
		service.modiTitle(title);
		
		response.sendRedirect("TitleListServlet");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
