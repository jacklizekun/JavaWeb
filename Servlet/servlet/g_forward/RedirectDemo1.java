package g_forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//保存数据到request域对象
		request.setAttribute("name", "kun");
		
		//重定向
		//可以跳转到web应用内，或其他web应用，甚至其他外部域名
		response.sendRedirect("/Servlet/GetDataServlet");
	}

}
