package cn.kyle.shoppingMall.service.impl;

import cn.kyle.shoppingMall.domain.Product;
import cn.kyle.shoppingMall.mapper.ProductMapper;
import cn.kyle.shoppingMall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> selectAllProduct() {
        return productMapper.findAllProduct();
    }

    @Override
    public List<Product> selectByProductNumber(String productNumber) {
        if ("allProduct".equals(productNumber)){
            //所有产品
            return productMapper.findAllProduct();
        }
        //其余的根据产品编码查询
        return productMapper.findByProductNumber(productNumber);
    }

    @Override
    public Product selectById(String id) {
        return productMapper.findById(id);
    }
}
