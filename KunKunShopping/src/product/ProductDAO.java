package product;

import java.util.List;
/**
 * 商品模块持久层的接口
 * @author 李泽坤
 *
 */
public interface ProductDAO {
	public List<Product> getProducts();
	public int getProducts(List<Product> products, int pageNo, int pageSize, boolean lazy);
	public void add(Product p);
	public void delete(int id);
	public void update(Product p);
	public Product loadById(int id);
	public void delete(String conditionStr);
	public int find(List<Product> products, int pageNo, int pageSize, String queryStr);
}

