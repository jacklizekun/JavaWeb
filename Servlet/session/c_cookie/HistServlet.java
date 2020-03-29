package c_cookie;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 用户上次访问时间
 * @author 李泽坤
 *
 */
public class HistServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		//获取当前时间
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String curTime = format.format(new Date());
		//取得cookie
		Cookie[] cookies = request.getCookies();
		String lastTime = null;
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("lastTime")){
					//有lastTime的cookie，已经是第n次访问
					lastTime = cookie.getValue();//上次访问的时间
					//第n次访问
					//把上次显示时间显示到浏览器
					response.getWriter().write("欢迎回来，你上次访问的时间为："+lastTime+",当前时间为："+curTime);
					//更新cookie
					cookie.setValue(curTime);
					cookie.setMaxAge(1*30*24*60*60);
					//把更新后的cookie发送到浏览器
					response.addCookie(cookie);
					break;
				}
			}
		}
		
		if(cookies==null || lastTime==null){
			//显示当前时间到浏览器
			response.getWriter().write("你是首次访问本网站，当前时间为："+curTime);
			//创建Cookie对象
			Cookie cookie = new Cookie("lastTime",curTime);
			cookie.setMaxAge(1*30*24*60*60);//保存一个月
			//把cookie发送到浏览器保存
			response.addCookie(cookie);
		}
	}

}
