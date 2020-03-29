package request;

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
public class RequestDemo2 extends HttpServlet {
/*
 * tomcat服务器首先会调用servlet的service方法，然后在service方法中再根据请求方式来分别调用对应的doXX方法
 */
	
	/*@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(req.getMethod());
		System.out.println("service方法被调用");
	}*/
	
	// 该方法用于接收浏览器的Get方式提交的请求
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("GET方式提交");
	}

	//该方法用于接收浏览器的Post方式提交的请求
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("Post方式提交");
	}

}
