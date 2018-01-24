package cn.kyle.shoppingMall.mapper;

import cn.kyle.shoppingMall.domain.ShoppingCart;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/11/20.
 */
@Repository
public interface ShoppingCartMapper {

    /**
     * 通过用户id查找对应的购物车
     * @param userId
     * @return
     */
    ShoppingCart findByUserId(@Param("userId") String userId);


}
