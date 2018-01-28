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
                <li role="presentation" class="active"><a href="#allProduct" aria-controls="allProduct" role="tab" data-toggle="tab">全部项目</a></li>
                <li role="presentation"><a href="#medicine" aria-controls="medicine" role="tab" data-toggle="tab">中医推拿</a></li>
                <li role="presentation"><a href="#feetSpa" aria-controls="feetSpa" role="tab" data-toggle="tab">足疗SPA</a></li>
                <li role="presentation"><a href="#femaleAndChild" aria-controls="femaleAndChild" role="tab" data-toggle="tab">女性·小儿</a></li>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane fade in active" id="allProduct">全部项目</div>
                <div role="tabpanel" class="tab-pane fade" id="medicine">中医推拿</div>
                <div role="tabpanel" class="tab-pane fade" id="feetSpa">足疗SPA</div>
                <div role="tabpanel" class="tab-pane fade" id="femaleAndChild">女性·小儿</div>
            </div>
        </div>

    </div>
</div>
</body>
