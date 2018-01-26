package cn.kyle.shoppingMall.controller;

import cn.kyle.shoppingMall.domain.Product;
import cn.kyle.shoppingMall.domain.ShoppingCart;
import cn.kyle.shoppingMall.domain.User;
import cn.kyle.shoppingMall.mapper.ProductMapper;
import cn.kyle.shoppingMall.mapper.UserMapper;
import cn.kyle.shoppingMall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/9/19.
 */
@Controller
public class LoginController extends BaseController{

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private IUserService userService;

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/login")
    public String index(){
        return "login";
    }

    /**
     *  @Valid 注解用来校验传入的User对象，Errors对象用来捕捉校验时产生的错误
     * @param request
     * @param user
     * @return
     */
    @PostMapping("/loginValidate")
    @ResponseBody
    public String loginValidate(HttpServletRequest request,User user){
        List<User> users = userService.selectByUser(user);
        if (users.size() == 1){
            user = users.get(0);
            request.getSession().setAttribute("USER_IN_SESSION",user);
            ShoppingCart cartInSession = (ShoppingCart)request.getSession().getAttribute("CART_IN_SESSION");
            if (cartInSession==null){
                //session中没有购物车则创建一个,并与user关联，然后放到session中
                cartInSession = new ShoppingCart();
                cartInSession.setCartId(UUID.randomUUID().toString().replace("-",""));
                cartInSession.setUserId(user.getId());
                request.getSession().setAttribute("CART_IN_SESSION",cartInSession);
            }
            return "true";
        } else {
            return "false";
        }
    }

    /**
     * 用户登陆校验通过后post跳转到main页面
     * @param request
     * @return
     */
    @PostMapping("/main")
    public String postMain(HttpServletRequest request,ModelMap modelMap){
        request.getSession().setAttribute("USER_IN_SESSION",getUser(request));
        List<Product> productList = productMapper.findAllProduct();
		modelMap.addAttribute("productList", productList);
        return "main";
    }
    
    /**
     * 
     * @Title: getMain 
     * @param：@param modelMap
     * @param：@return
     * @return：String
     * @Description：浏览器刷新get请求到main页面 
     * @author huyf
     * @date 2017年10月21日 上午10:45:25
     * @throws
     */
    @GetMapping("/main")
    public String getMain(ModelMap modelMap){
    	List<Product> productList = productMapper.findAllProduct();
		modelMap.addAttribute("productList", productList);
		modelMap.addAttribute("http", "get");
        return "main";
    }
}
