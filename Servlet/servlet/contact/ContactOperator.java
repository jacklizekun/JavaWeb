package contact;

import java.util.List;

/**
 * 联系人相关操作
 * @author 李泽坤
 *
 */
public interface ContactOperator {
	public void addContact(Contact contact);//增加联系人
	public void updateContact(Contact contact);//修改联系人
	public void deleteContact(String id);//根据ID删除联系人
	public List<Contact> findAll();//查询所有联系人
}
