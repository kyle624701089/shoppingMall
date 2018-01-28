package cn.kyle.shoppingMall.service;

import cn.kyle.shoppingMall.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> selectAllProduct();

    List<Product> selectByProductNumber(String productNumber);

    Product selectById(String id);
}
