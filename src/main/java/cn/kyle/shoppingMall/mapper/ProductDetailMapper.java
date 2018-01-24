/**   
* @Title: ProductDetailMapper.java 
* @Package cn.kyle.shoppingMall.mapper 
* @Description: TODO(用一句话描述该文件做什么) 
* @author sunkai   
* @date 2017年10月24日 下午8:17:21 
* @version V1.0   
*/ 
package cn.kyle.shoppingMall.mapper;

import cn.kyle.shoppingMall.domain.ProductDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName：ProductDetailMapper
 * @Description：
 * @company:zhph
 * @author sunkai
 * @date 2017年10月24日 下午8:17:21
 */
@Repository
public interface ProductDetailMapper {
	
	/**
	 * 
	 * @Title: findProductDetailByProductId 
	 * @param：@param productId
	 * @param：@return
	 * @return：ProductDetail
	 * @Description：根据产品id查找对应的产品详情
	 * @author sunkai
	 * @date 2017年10月24日 下午8:26:20
	 * @throws
	 */
	public List<ProductDetail> findProductDetailByProductId(@Param(value = "productId") String productId);
}
