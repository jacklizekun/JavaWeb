package client;

import product.Product;
/**
 * 购物车详情
 * @author 李泽坤
 *
 */
public class CartItem {
	private Product product;

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
