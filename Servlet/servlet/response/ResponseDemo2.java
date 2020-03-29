package response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求重定向
 * @author 李泽坤
 *
 */
public class ResponseDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		/*response.setStatus(302);//发送一个302状态码
		response.setHeader("location", "/Servlet/adv.html"); //location的响应头
*/		
		
		//请求重定向简化写法
		response.sendRedirect("/Servlet/adv.html");
		
		
	}

}
