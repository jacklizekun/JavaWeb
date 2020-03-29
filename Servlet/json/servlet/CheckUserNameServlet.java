package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.impl.UserDaomImpl;
/**
 * 检查用户姓名
 * @author 李泽坤
 *
 */
public class CheckUserNameServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//设置编码方式
			request.setCharacterEncoding("UTF-8");
			//检测是否存在
			String name = request.getParameter("name");
			System.out.println("name="+name);
			
			UserDao dao = new UserDaomImpl();
			boolean isExist = dao.checkUserName(name);

			if(isExist){
				response.getWriter().println(1);  
				//存在用户名
			}else{
				response.getWriter().println(2); 
				//不存在该用户名
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
