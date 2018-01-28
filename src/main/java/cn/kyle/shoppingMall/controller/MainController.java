/**   
* @Title: MainController.java 
* @Package cn.kyle.shoppingMall.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author sunkai   
* @date 2017年10月19日 上午9:48:06 
* @version V1.0   
*/ 
package cn.kyle.shoppingMall.controller;

import cn.kyle.shoppingMall.domain.Product;
import cn.kyle.shoppingMall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName：MainController
 * @Description：处理main页面的请求
 * @company:zhph
 * @author sunkai
 * @date 2017年10月19日 上午9:48:06
 */
@Controller
@RequestMapping("/mainContr")
public class MainController extends BaseController{

	@Autowired
	private IProductService productService;

	//根据产品类型标签页展示对应的产品列表
	@RequestMapping("/getProductList")
	public String getProductList(HttpServletRequest request,ModelMap modelMap){
		String productType = request.getParameter("productType");
		List<Product> productList = productService.selectByProductNumber(productType);
		modelMap.addAttribute("productList", productList);
		return "productListPage";
	}
	
	//产品详情展示页面
	@PostMapping("/productDetail")
	public String postProductDetail(HttpServletRequest request,ModelMap modelMap){
		String productId = request.getParameter("productId");
		Product product = productService.selectById(productId);
		modelMap.addAttribute("product", product);
		return "productDetailPage";
	}
}
