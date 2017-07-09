package cn.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.study.pojo.Product;
import cn.study.service.ProductService;
import cn.study.vo.ProductVO;
@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/queryProduct.action")
	public String queryProduct(Model model , ProductVO vo) throws Exception{
		List<Product> productlist = productService.findProductList(vo);
		model.addAttribute("productlist", productlist);
		
		return "success";
		
	}
	

}
