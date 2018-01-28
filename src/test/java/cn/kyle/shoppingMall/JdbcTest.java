package cn.kyle.shoppingMall;

import cn.kyle.shoppingMall.domain.Product;
import cn.kyle.shoppingMall.domain.ProductPage;
import cn.kyle.shoppingMall.domain.User;
import cn.kyle.shoppingMall.mapper.ProductMapper;
import cn.kyle.shoppingMall.mapper.ProductPageMapper;
import cn.kyle.shoppingMall.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 数据库连接测试
 *
 * @author kyle
 * @create 2018 - 01 - 23 15:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring.xml"})
public class JdbcTest {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProductPageMapper productPageMapper;

    @Test
    public void test(){
        List<Product> allProduct = productMapper.findAllProduct();
        for (Product pro:allProduct) {
            System.out.println(pro);
        }
    }

    @Test
    public void userTest(){
        List<User> all = userMapper.findAll();
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
    }

    @Test
    public void addProductPageTest(){
        ProductPage productPage1 = new ProductPage("1","全部项目","allProduct",1);
        ProductPage productPage2 = new ProductPage("2","中医推拿","medicine",2);
        ProductPage productPage3 = new ProductPage("3","足疗SPA","feetSpa",3);
        ProductPage productPage4 = new ProductPage("4","女性小儿","femaleAndChild",4);
        productPageMapper.addProductPage(productPage1);
        productPageMapper.addProductPage(productPage2);
        productPageMapper.addProductPage(productPage3);
        productPageMapper.addProductPage(productPage4);
    }


    @Test
    public void productPageSelectTest(){
        List<ProductPage> allProductPage = productPageMapper.findAllProductPage();
        for (ProductPage p:allProductPage) {
            System.out.println(p);
        }
    }

}
