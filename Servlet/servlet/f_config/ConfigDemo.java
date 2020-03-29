package f_config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ServletConfig对象
 * @author 李泽坤
 *
 */
public class ConfigDemo extends HttpServlet {
	
	/*private ServletConfig config;*/
	
	/*
	 * tomcat服务器把这些参数会在加载web应用的时候，封装到ServletConfig对象中 
	 * tomcat服务器调用init方法传入ServletConfig对象
	 */
	/*@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}*/
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//读取servlet的初始参数
		String path = this.getServletConfig().getInitParameter("path");
		File file = new File(path);
		//读取内容
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = null;
		while( (str=br.readLine())!=null ){
			System.out.println(str);
		}
		
		//查询当前servlet的所有初始化参数
		Enumeration<String> enums = this.getServletConfig().getInitParameterNames();
		while(enums.hasMoreElements()){
			String paramName = enums.nextElement();
			String paramValue = this.getServletConfig().getInitParameter(paramName);
			System.out.println(paramName+"="+paramValue);
		}	
		//得到servlet的名称
		String servletName = this.getServletConfig().getServletName();
		System.out.println(servletName);
	}

}
