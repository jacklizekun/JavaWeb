package dao;

import entity.Product;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class ProductDao {
	private static List<Product> data = new ArrayList<Product>();
	
	//初始化商品数据
	static{
		//只执行一次
		for(int i=1;i<=10;i++){
			data.add(new Product(""+i,"笔记本"+i,"LN00"+i,34.0+i));
		}
	}
	public List<Product> findAll(){
		return data;
	}
	public Product findById(String id){
		for(Product p:data){
			if(p.getId().equals(id)){
				return p;
			}
		}
		return null;
	}

}
