package e_thread;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * servlet的多线程并发问题
 * @author 李泽坤
 *
 */
public class TheradDemo extends HttpServlet {
	
	int count = 1;

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		synchronized (TheradDemo.class) {
			//锁对象必须唯一，建议使用类对象
			response.getWriter().write("你现在是当前网站的第"+count+"个访客");  
			//线程1执行完  ， 线程2执行
		
		//线程1还没有执行count++
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
			count++;
		}
	}

}
