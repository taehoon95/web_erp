package web_erp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_erp.dto.Title;
import web_erp.service.TitleService;

@WebServlet("/TitleGetServlet")
public class TitleGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TitleService service;

    public TitleGetServlet() {
    	service = new TitleService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("html/text;charset=utf-8");
		
		int no = Integer.parseInt(request.getParameter("titleNo").trim());
		
		Title title = service.showTitle(new Title(no));
			
		request.setAttribute("title", title);
		request.getRequestDispatcher("titleInfo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
