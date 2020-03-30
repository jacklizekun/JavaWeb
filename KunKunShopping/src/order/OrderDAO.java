package order;

import java.util.List;

import product.Product;
/**
 * 订单模块的持久层接口
 * @author 李泽坤
 *
 */
public interface OrderDAO {
	//更新
	public void update(SalesOrder so);
	//添加
	public int add(SalesOrder so);
	//获取订单
	public List<SalesOrder> getOrders();
	//传入页数和页码，获取订单
	public int getOrders(List<SalesOrder> orders, int pageNo, int pageSize);
	//传入id删除
	public void delete(int id);
	//传入id查找订单
	public SalesOrder loadById(int id);
	public void delete(String conditionStr);
	public int find(List<SalesOrder> products, int pageNo, int pageSize, String queryStr);
	public List<SalesItem> getSalesItems(int orderId);
	public void updateStatus(SalesOrder order);
	
}
