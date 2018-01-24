<%--
  Created by IntelliJ IDEA.
  User: kyle
  Date: 2018/1/23
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>

<%--<html>--%>
<%--<style>--%>
    <%--.body{--%>
        <%--background-color: #06c7cc;--%>
        <%--width: 500px;--%>
        <%--height: 800px;--%>
        <%--text-align: center;--%>
    <%--}--%>
<%--</style>--%>
<%--<head>--%>
    <%--<title>欢迎界面</title>--%>
    <%--<jsp:include page="/include.jsp"/>--%>
<%--</head>--%>
<%--<body class="body">--%>
    <%--欢迎光临！--%>

    <%--<div class="ui-form ui-border-t" style="vertical-align: middle;text-align: left">--%>
        <%--<form>--%>
            <%--<div class="ui-form-item ui-form-item-show ui-border-b">--%>
                <%--账&nbsp;&nbsp;&nbsp;号：--%>
                <%--<input id="username" type="text" value="" placeholder="QQ号/手机号/邮箱"/>--%>
            <%--</div>--%>
            <%--<div class="ui-form-item ui-form-item-show ui-border-b">--%>
                <%--密&nbsp;&nbsp;&nbsp;码：--%>
                <%--<input id="password" type="text" value="" placeholder="密码"/>--%>
            <%--</div>--%>
            <%--<div class="ui-form-item ui-form-item-show ui-border-b">--%>
                <%--身份证号码：--%>
                <%--<input id="idCard" type="text" value=""/>--%>
            <%--</div>--%>
        <%--</form>--%>
    <%--</div>--%>
    <%--<div class="ui-btn-wrap">--%>
        <%--<button class="ui-btn ui-btn-primary">--%>
            <%--确定--%>
        <%--</button>--%>
    <%--</div>--%>

<%--</body>--%>
<%--</html>--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="format-detection" content="telephone=yes">
    <title>FrozenUI Demo</title>
    <jsp:include page="../../include.jsp"/>
</head>
<body ontouchstart="">
<header class="ui-header ui-header-positive ui-border-b">
    <i class="ui-icon-return" onclick="history.back()"></i><h1>选项卡 tab</h1><button class="ui-btn">回首页</button>
</header>
<footer class="ui-footer ui-footer-btn">
    <ul class="ui-tiled ui-border-t">
        <li data-href="index.html" class="ui-border-r"><div>基础样式</div></li>
        <li data-href="ui.html" class="ui-border-r"><div>UI组件</div></li>
        <li data-href="js.html"><div>JS插件</div></li>
    </ul>
</footer>
<section class="ui-container">
    <section id="tab">
        <div class="demo-item">
            <p class="demo-desc">标签栏</p>
            <div class="demo-block">
                <div class="ui-tab">
                    <ul class="ui-tab-nav ui-border-b">
                        <li class="current">热门推荐</li>
                        <li>全部表情</li>
                        <li>表情</li>
                    </ul>
                    <ul class="ui-tab-content" style="width:300%">
                        <li>内容1</li>
                        <li>内容2</li>
                        <li>内容3</li>
                    </ul>
                </div>
            </div>
            <script class="demo-script">

            </script>
        </div>
    </section>
</section>
<script>
    (function (){
        var tab = new fz.Scroll('.ui-tab', {
            role: 'tab',
            autoplay: true,
            interval: 3000
        });
        /* 滑动开始前 */
        tab.on('beforeScrollStart', function(fromIndex, toIndex) {
            console.log(fromIndex,toIndex);// from 为当前页，to 为下一页
        })
    })();
</script>
</body>
</html>