package a_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * response.getWriter().write
 * @author 李泽坤
 *
 */
public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)throws ServletException, IOException {
		//向浏览器输出内容
		response.getWriter().write("this is first servlet！");
	}
}
