package cn.study.service.impl;

import java.util.List;

import cn.study.mapper.ProductMapper;
import cn.study.pojo.Product;
import cn.study.service.ProductService;
import cn.study.vo.ProductVO;

public class ProductServiceImpl implements ProductService  {
	private ProductMapper productmapper;
	public List<Product> findProductList(ProductVO vo) {
		
		return productmapper.findProductList(vo);
	}

}
