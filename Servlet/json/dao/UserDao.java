package dao;

import java.sql.SQLException;
/**
 * 接口：用于检测用户名是否存在
 * @author 李泽坤
 *
 */
public interface UserDao {
	boolean checkUserName(String username) throws SQLException;
}
