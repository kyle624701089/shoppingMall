<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="format-detection" content="telephone=yes">
    <title>登录页面</title>
    <jsp:include page="../../include.jsp"/>
</head>
<body>
<div class="container">
    <div class="row center-block" style="text-align: center">
        <form id="loginForm" style="vertical-align: middle" class="form-horizontal">
            <div class="form-group" style="text-align: left">
                <label for="username" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="username" placeholder="QQ/手机号/邮箱">
                </div>
            </div>
            <div class="form-group" style="text-align: left">
                <label for="password" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-8">
                    <input type="password" class="form-control" id="password" placeholder="密码">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10" >
                    <div class="checkbox" style="text-align: left">
                        <label>
                            <input type="checkbox"> 记住我
                        </label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="button" class="btn btn-primary" onclick="login()" id="loginBtn">登录</button>
                    &nbsp;&nbsp;&nbsp;
                    <button type="button" class="btn btn-success" onclick="regis()" id="regisBtn">注册</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
<script>
    /*登录*/
    function login() {
        var username = $("#username").val().trim();
        var password = $("#password").val().trim();
        if (!username.length || !password.length){
            SYS.alert("用户名或密码不能为空!");
            return false;
        }
        $.ajax({
           url:"/loginValidate",
            dataType:"text",
            async:false,
            type:"post",
            data:{
               "username":username,
                "password":password
            },
            success:function (text) {
               /*登录成功*/
                if ("true"===text){
                    SYS.ajax({
                        url:"/main",
                        dataType:"html",
                        type:"post",
                        data:{},
                        success:function (html) {
                            $(".container").html(html);
                        }
                    })
                }
                /*登录失败*/
                if ("false"===text){
                    SYS.alert("用户名或密码错误!");
                }
            }
        });
    }
</script>