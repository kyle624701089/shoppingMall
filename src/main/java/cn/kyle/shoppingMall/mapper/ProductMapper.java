/**   
* @Title: ProductMapper.java 
* @Package cn.kyle.shoppingMall.mapper 
* @Description: TODO(用一句话描述该文件做什么) 
* @author sunkai   
* @date 2017年10月18日 下午8:17:31 
* @version V1.0   
*/ 
package cn.kyle.shoppingMall.mapper;

import cn.kyle.shoppingMall.domain.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName：ProductMapper
 * @Description：
 * @company:zhph
 * @author sunkai
 * @date 2017年10月18日 下午8:17:31
 */
@Repository
public interface ProductMapper {
	/**
	 * 
	 * @Title: findAllProduct 
	 * @param：@return
	 * @return：List<Product>
	 * @Description：查找所有产品 
	 * @author sunkai
	 * @date 2017年10月18日 下午8:19:56
	 * @throws
	 */
	List<Product> findAllProduct();

	/**
	 * @Title: findByProductNumber
	 * @param：@param productNumber
	 * @param：@return
	 * @return：List<Product>
	 * @Description：根据产品类型查询对应的产品列表
	 * @author sunkai
	 * @date 2017年10月19日 上午9:57:52
	 * @throws
	 */
	List<Product> findByProductNumber(@Param(value = "productNumber") String productNumber);

	/**
	 * @Title: findById
	 * @param：@param productId
	 * @param：@return
	 * @return：Product
	 * @Description：根据产品id查询对应的产品
	 * @author sunkai
	 * @date 2017年10月21日 下午1:58:30
	 * @throws
	 */
	Product findById(@Param(value = "productId") String productId);

}
