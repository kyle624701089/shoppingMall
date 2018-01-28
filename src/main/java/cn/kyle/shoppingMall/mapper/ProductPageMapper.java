package cn.kyle.shoppingMall.mapper;

import cn.kyle.shoppingMall.domain.ProductPage;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductPageMapper {
    List<ProductPage> findAllProductPage();

    void addProductPage(ProductPage productPage);
}
