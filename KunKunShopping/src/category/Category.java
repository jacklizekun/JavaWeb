package category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.DB;
/**
 * 商品的分类的实体层
 * @author 李泽坤
 *
 */
public class Category {
	//三层分类
	public static final int MAX_GRADE = 3;
	//每一级别分类100个
	static final int LEVEL_LENGTH = 2;
	
	private int id;

	private String name;

	private String descr;

	private int pid;

	private int cno;

	private int grade;

	

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	//更新分类
	public void update() {
		Connection conn = DB.getConn();
		String sql = "update category set name = ? , descr = ? where id = ?";
		PreparedStatement pstmt = DB.prepare(conn, sql);
		try {
			//传参
			pstmt.setString(1, name);
			pstmt.setString(2, descr);
			pstmt.setInt(3, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.close(pstmt);
			DB.close(conn);
		}
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}
	
	public List<Category> getChilds() {
		return null;
	}
}
