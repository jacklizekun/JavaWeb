package f_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * web应用路径
 * @author 李泽坤
 *
 */
public class ContextDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//得到ServletContext对象
		//ServletContext context = this.getServletConfig().getServletContext();
		ServletContext context = this.getServletContext(); 
		//得到web应用路径：部署到tomcat服务器上运行的web应用名称
		String contextPath = context.getContextPath();
		
		System.out.println(contextPath);
		
		response.sendRedirect(contextPath+"/index.html");
	}

}
