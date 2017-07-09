package cn.study.mapper;

import java.util.List;

import cn.study.pojo.Product;
import cn.study.vo.ProductVO;

public interface ProductMapper {
	
	

	public List<Product> findProductList(ProductVO productVO);
}
