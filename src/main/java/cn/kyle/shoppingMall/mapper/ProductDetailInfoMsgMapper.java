package cn.kyle.shoppingMall.mapper;

import cn.kyle.shoppingMall.domain.ProductDetailInfoMsg;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailInfoMsgMapper {
	
	public List<ProductDetailInfoMsg> findDetailInfoMsgListByDetailInfoId(@Param(value = "detialInfoId") String detialInfoId);
}
