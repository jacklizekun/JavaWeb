package request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 防止非法链接
 * @author 李泽坤
 *
 */
public class RequestDemo4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//得到referer头
		String referer = request.getHeader("referer");
		System.out.println("referer="+referer);
		
		if(referer==null || !referer.contains("/Servlet/adv.html")){
			response.getWriter().write("当前是非法链接，请回到首页。<a href='/day09/adv.html'>首页</a>");
		}else{
			//正确的链接
			response.getWriter().write("资源正在下载...");
		}
	
	}

}
