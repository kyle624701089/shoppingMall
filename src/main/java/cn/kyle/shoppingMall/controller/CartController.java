package cn.kyle.shoppingMall.controller;

import cn.kyle.shoppingMall.domain.Product;
import cn.kyle.shoppingMall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/11/17.
 * 购物车controller
 */
@Controller
@RequestMapping("/cartContr")
public class CartController {

    @Autowired
    private IProductService productService;

    @PostMapping("/odderPage")
    public String odderPage(HttpServletRequest request,ModelMap modelMap){
        String productId = request.getParameter("productId");
        Product product = productService.selectById(productId);
        modelMap.addAttribute("product",product);
        return "odderPage";
    }
}
