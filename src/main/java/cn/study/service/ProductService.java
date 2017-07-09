package cn.study.service;

import java.util.List;

import cn.study.pojo.Product;
import cn.study.vo.ProductVO;

public interface ProductService {
	
	public List<Product> findProductList(ProductVO vo);

}
