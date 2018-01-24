package cn.kyle.shoppingMall;

import cn.kyle.shoppingMall.domain.Product;
import cn.kyle.shoppingMall.mapper.ProductMapper;
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

    @Test
    public void test(){
        List<Product> allProduct = productMapper.findAllProduct();
        for (Product pro:allProduct) {
            System.out.println(pro);
        }
    }

}
