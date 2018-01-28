/**   
* @Title: ProductPage.java 
* @Package cn.kyle.shoppingMall.domain 
* @Description: TODO(用一句话描述该文件做什么) 
* @author sunkai   
* @date 2017年10月19日 下午2:00:31 
* @version V1.0   
*/ 
package cn.kyle.shoppingMall.domain;

/**
 * @ClassName：ProductPage
 * @Description：用于main页面产品类别的分页展示
 * @company:zhph
 * @author sunkai
 * @date 2017年10月19日 下午2:00:31
 */

public class ProductPage extends BaseEntity{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	private String id;
	private String pageName;//分页名称
	//对应产品的分类：所有商品（allProduct），中医推拿（medicine），足疗SPA（feetSpa），女性小儿（femaleAndChild）
	private String pageNumber;
	//标签页上的展示顺序
	private Integer showOrder;

    public ProductPage() {
        super();
    }

    public ProductPage(String id, String pageName, String pageNumber, Integer showOrder) {
        this.id = id;
        this.pageName = pageName;
        this.pageNumber = pageNumber;
        this.showOrder = showOrder;
    }

    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    @Override
    public String toString() {
        return "ProductPage{" +
                "id='" + id + '\'' +
                ", pageName='" + pageName + '\'' +
                ", pageNumber='" + pageNumber + '\'' +
                ", showOrder=" + showOrder +
                '}';
    }
}
