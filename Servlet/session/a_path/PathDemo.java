package a_path;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * web应用路径问题
 * @author李泽坤
 *
 */
public class PathDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		/*
		 *  目标资源给服务器使用的：   / 表示在当前web应用的根目
		 *  目标资源给浏览器使用的： /  表示在webapps的根目录下
		 */
		//转发
		//request.getRequestDispatcher("/target.html").forward(request, response);
		
		//请求重定向
		//response.sendRedirect("/Servlet/target.html");
		//html页面的超连接href
		response.getWriter().write("<html><body><a href='/Servlet/target.html'>超链接</a></body></html>");
		
		//html页面中的form提交地址
		response.getWriter().write("<html><body><form action='/Servlet/target.html'><input type='submit'/></form></body></html>");
	}

}
