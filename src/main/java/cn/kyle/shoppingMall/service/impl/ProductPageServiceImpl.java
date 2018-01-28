package cn.kyle.shoppingMall.service.impl;

import cn.kyle.shoppingMall.domain.ProductPage;
import cn.kyle.shoppingMall.mapper.ProductPageMapper;
import cn.kyle.shoppingMall.service.IProductPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPageServiceImpl implements IProductPageService {

    @Autowired
    private ProductPageMapper productPageMapper;

    @Override
    public List<ProductPage> selectAllProductPage() {
        return productPageMapper.findAllProductPage();
    }
}
