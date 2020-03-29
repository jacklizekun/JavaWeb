package c_cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 删除cookie
 * @author 李泽坤
 *
 */
public class DeleteCookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		Cookie cookie = new Cookie("name","kunkun");
		cookie.setMaxAge(0);//删除同名的cookie
		response.addCookie(cookie);
		System.out.println("删除成功");
		
	}

}
