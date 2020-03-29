package d_init;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * 有参和无参的init方法
 * @author 李泽坤
 *
 */
public class InitDemo extends HttpServlet {
		
	//servlet的生命周期方法，一定会被tomcat服务器调用
	//参数ServletConfig 
	/*@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("有参数的init方法");
	}*/
	
	@Override
	public void init() throws ServletException {
		System.out.println("无参数的init方法");
	}
	
	
}
