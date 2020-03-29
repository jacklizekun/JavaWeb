package f_context;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * web应用参数
 * @author 李泽坤
 *
 */
public class ContextDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		ServletContext context = this.getServletContext();
		System.out.println("参数"+context.getInitParameter("AAA"));
		
		Enumeration<String> enums = context.getInitParameterNames();
		while(enums.hasMoreElements()){
			String paramName = enums.nextElement();
			String paramValue  =context.getInitParameter(paramName);
			System.out.println(paramName+"="+paramValue);
		}
		
		String path = this.getServletConfig().getInitParameter("path");
		System.out.println("path="+path);
	}

}
