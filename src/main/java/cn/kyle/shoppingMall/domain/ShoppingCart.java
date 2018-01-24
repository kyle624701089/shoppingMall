package cn.kyle.shoppingMall.domain;

import cn.kyle.shoppingMall.mapper.ProductMapper;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/20.
 * 购物车，包括总金额，物品总数，商品(按照商品分类和数量)Map
 */
public class ShoppingCart extends BaseEntity{

    @Resource
    private ProductMapper productMapper;

    /**
     * userId：对应用户id，一个用户拥有对应的唯一的购物车
     * cartId:购物车id
     * totalPrice:购物车所有商品的总金额
     * goodCount:购物车商品总数
     *
     */
    private String cartId;
    private String userId;
    private Double totalPrice;
    private Long goodCount;
    private HashMap<String,Integer> productMap;

    public ShoppingCart(){
        this.totalPrice = 0.0;
        this.goodCount = 0L;
        this.productMap = new HashMap<>();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    /**
     * 购物车所有物品总金额
     * @return
     */
    public Double getTotalPrice() {
        Iterator<Map.Entry<String, Integer>> iterator = productMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String productId = next.getKey();
            Double price =Double.valueOf(productMapper.findProductByProductId(productId).getPrice());
            totalPrice += price*next.getValue();
        }
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getGoodCount() {
        Iterator<Integer> iterator = productMap.values().iterator();
        while (iterator.hasNext()){
            goodCount += iterator.next();
        }
        return goodCount;
    }

    public void setGoodCount(Long goodCount) {
        this.goodCount = goodCount;
    }

    public HashMap<String, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(HashMap<String, Integer> productMap) {
        this.productMap = productMap;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "userId='" + userId + '\'' +
                ", cartId='" + cartId + '\'' +
                ", totalPrice=" + totalPrice +
                ", goodCount=" + goodCount +
                ", productMap=" + productMap +
                '}';
    }

    /**
     * 添加商品到购物车
     * @param product
     */
    public void addItem(Product product){
        String productId = product.getId();
        if (productMap.containsKey(productId)){
            //购物车已经存在该商品
            productMap.put(productId,productMap.get(product)+1);
        } else {
            //不存在则添加
            productMap.put(productId,1);
        }
    }

    /**
     * 删除
     * @param product
     */
    public void delItem(Product product){
        String productId = product.getId();
        if (productMap.containsKey(productId)){
            //只有购物车包含该商品时才能删除
            productMap.put(productId,productMap.get(product)-1);
        }
    }

    /**
     * 返回一个商品的总金额
     * @param productId
     * @return
     */
    public Double getAProductTotalPrice(String productId){
        if (productMap.containsKey(productId)){
            Integer count = productMap.get(productId);
            Double price = Double.valueOf(productMapper.findProductByProductId(productId).getPrice());
            return count*price;
        } else {
            return 0.0D;
        }
    }

}
