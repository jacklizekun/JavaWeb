package response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 设置响应信息
 * @author 李泽坤
 *
 */
public class ResponseDemo1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//response.setStatus(404);//修改状态码
		//response.sendError(404); // 发送404的状态码+404的错误页面
		response.setHeader("server", "JBoss");

		//response.getWriter().write("01.hello world"); //字符内容。
		response.getOutputStream().write("02.hello world".getBytes());//字节内容
		 

	}
	
}
