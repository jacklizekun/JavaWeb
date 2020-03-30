package user;
/**
 * 自定义异常，密码不正确
 * @author 李泽坤
 *
 */
public class PasswordNotCorrectException extends RuntimeException {

	public PasswordNotCorrectException(String message) {
		super(message);
	}
	
}
