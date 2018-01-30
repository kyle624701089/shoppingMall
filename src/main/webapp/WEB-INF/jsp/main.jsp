<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kyle
  Date: 2018/1/23
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="format-detection" content="telephone=yes">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <title>main页面</title>
    <jsp:include page="../../include.jsp"/>
</head>
<body>
<div class="container">
    <div class="row center-block" style="text-align: center;width: 100%">
        <%--图片轮播--%>
        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            </ol>
            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="img/怪兽与蜥蜴.jpg" alt="图片">
                    <div class="carousel-caption">
                        图片1
                    </div>
                </div>
                <div class="item">
                    <img src="img/怪兽与蜥蜴.jpg" alt="图片">
                    <div class="carousel-caption">
                        图片2
                    </div>
                </div>
                <div class="item">
                    <img src="img/怪兽与蜥蜴.jpg" alt="图片">
                    <div class="carousel-caption">
                        图片3
                    </div>
                </div>
            </div>
            <!-- Controls -->
            <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <%--标签页--%>
        <div>
            <!-- Nav tabs -->
            <ul class="nav nav-tabs" role="tablist">
                <c:forEach items="${productPages}" var="productPage" varStatus="vs">
                    <c:if test="${vs.index == 0}">
                        <li role="presentation" class="active">
                            <a href="#allProduct" aria-controls="allProduct" role="tab" data-toggle="tab">全部项目</a>
                        </li>
                    </c:if>
                    <c:if test="${productPage.showOrder!=1}">
                        <li role="presentation">
                            <a href="#${productPage.pageNumber}" aria-controls="${productPage.pageNumber}" role="tab" data-toggle="tab">${productPage.pageName}</a>
                        </li>
                    </c:if>
                </c:forEach>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content">
                <c:forEach items="${productMap}" var="map">
                    <c:choose>
                        <c:when test="${map.key=='allProduct'}">
                            <div role="tabpanel" class="tab-pane fade in active" id="allProduct">
                        </c:when>
                        <c:otherwise>
                            <div role="tabpanel" class="tab-pane fade" id="${map.key}">
                        </c:otherwise>
                    </c:choose>
                    <div class="row">
                        <div class="col-xs-12">
                            <c:forEach items="${map.value}" var="product">
                                <div class="media search-media">
                                    <input type="text" hidden="hidden" name="productId" value="${product.id}"/>
                                    <div class="media-left">
                                        <a href="#">
                                            <img class="media-object" data-src="img/怪兽与蜥蜴.jpg" alt="${product.name}" style="width: 120px; height: 120px;" src="img/怪兽与蜥蜴.jpg" data-holder-rendered="true">
                                        </a>
                                    </div>
                                    <div class="media-body">
                                        <div style="text-align: left;">
                                            <h4 class="media-heading">
                                                <a href="#" class="blue">${product.name}</a>
                                            </h4>
                                            <p>${product.intro}</p>
                                        </div>
                                        <div class="search-actions text-left" style="margin-bottom: 5px;margin-top: 40px">
                                            <div class="action-buttons smaller-125">
                                                <span class="blue bolder bigger-150">￥${product.price}</span>
                                                <a href="#" style="margin-left: 15px">
                                                    <i class="ace-icon fa fa-phone green"></i>
                                                </a>
                                                <a href="#">
                                                    <i class="ace-icon fa fa-heart red"></i>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="media-right" style="vertical-align: bottom">
                                        <a class="search-btn-action btn btn-sm btn-block btn-info" onclick="buy(this)">预约</a>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </c:forEach>
            </div>
        </div>
        </div>
    </div>
</div>
</body>
<div class="btn-group btn-corner">
    <button class="btn">5</button>
    <button class="btn">6</button>
    <button class="btn">7</button>
</div>
<script type="text/javascript">

    /*预约*/
    function buy(target) {
        var productId = $(target).find("input[name=productId]").val();
        SYS.ajax({

        });
    }
</script>
