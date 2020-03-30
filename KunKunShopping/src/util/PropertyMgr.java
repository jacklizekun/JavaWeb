package util;

import java.io.IOException;
import java.util.Properties;
/**
 * 读取配置
 * @author 李泽坤
 *
 */
public class PropertyMgr {
	static Properties props = new Properties();
	
	static {
		try {
			props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config/shopping.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private PropertyMgr() {};
	
	public static String getProperty(String key) {
		return props.getProperty(key);
	}
}
