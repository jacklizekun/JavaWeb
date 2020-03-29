package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author 李泽坤
 *
 */
public class DemoServlet02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println("收到了请求..."+name+"="+age);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("给你一份数据");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
