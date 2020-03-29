package g_forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 转发
 * @author 李泽坤
 *
 */
public class ForwardDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		//保存数据到request域对象
		request.setAttribute("name", "kun");
		
		
		//转发	
		//不能转发当前web应用以外的资源
		/*RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/GetDataServlet");
		rd.forward(request, response);*/
		this.getServletContext().getRequestDispatcher("/GetDateServlet").forward(request, response);
	}

}
