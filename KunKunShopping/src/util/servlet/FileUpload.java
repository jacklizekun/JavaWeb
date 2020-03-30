package util.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.commons.fileupload.*;
import java.util.*;
import java.util.regex.*;
import java.io.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
/**
 * 文件上传
 * @author 李泽坤
 *
 */
public class FileUpload extends HttpServlet { 
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}
	private ServletConfig config = null;
	
	private File tempPath = new File("C:\\Desktop\\upload\\temp\\"); 
	// 用于存放临时文件的目录

	public void destroy() {
		config = null;
		super.destroy();
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		int id = -1;
		// 用于存放上传文件的目录
		String uploadPath = config.getInitParameter("uploadPath"); 
		res.setContentType("text/html; charset=GB2312");
		PrintWriter out = res.getWriter();
		System.out.println(req.getContentLength());
		System.out.println(req.getContentType());
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(4096);
		factory.setRepository(tempPath);

		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setSizeMax(1000000);
		try {
			List fileItems = upload.parseRequest(req);

			Iterator iter = fileItems.iterator();

			// 正则匹配，过滤路径取文件名
			String regExp = ".+\\\\(.+)$";

			// 过滤掉的文件类型
			String[] errorType = { ".exe", ".com", ".cgi", ".jsp" };
			Pattern p = Pattern.compile(regExp);
			while (iter.hasNext()) {
				FileItem item = (FileItem) iter.next();
				if(item.isFormField()) {
					if(item.getFieldName().equals("id")) {
						id = Integer.parseInt(item.getString());
					}
				}
				// 忽略其他不是文件域的所有表单信息
				if (!item.isFormField()) {
					String name = item.getName();
					long size = item.getSize();
					if ((name == null || name.equals("")) && size == 0)
						continue;
					Matcher m = p.matcher(name);
					boolean result = m.find();
					if (result) {
						for (int temp = 0; temp < errorType.length; temp++) {
							if (m.group(1).endsWith(errorType[temp])) {
								throw new IOException(name + ": wrong type");
							}
						}
						try {

							// 保存上传的文件到指定的目录

							// 在下文中上传文件至数据库时，将对这里改写
							item.write(new File(uploadPath + id + ".jpg"));

							out.print(name + "&nbsp;&nbsp;" + size + "<br>");
						} catch (Exception e) {
							out.println(e);
						}

					} else {
						throw new IOException("fail to upload");
					}
				}
			}
		} catch (IOException e) {
			out.println(e);
		} catch (FileUploadException e) {
			out.println(e);
		}

	}

	

}
