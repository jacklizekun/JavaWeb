package user;
/**
 * 自定义异常用户未发现
 * @author 李泽坤
 *
 */
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
	}
	
}
