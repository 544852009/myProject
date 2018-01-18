<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/4/004
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>

    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        body{
            font-family: "微软雅黑";
            font-size: 14px;
            background: url("../../../static/images/beijing.jpg") fixed center center;
        }
        .logo_box{
            width: 280px;
            height: 490px;
            padding: 35px;
            color: #EEE;
            position: absolute;
            left: 50%;
            top:100px;
            margin-left: -175px;
        }
        .logo_box h3{
            text-align: center;
            height: 20px;
            font: 20px "microsoft yahei",Helvetica,Tahoma,Arial,"Microsoft jhengHei",sans-serif;
            color: #FFFFFF;
            height: 20px;
            line-height: 20px;
            padding:0 0 35px 0;
        }

        .input_outer{
            height: 46px;
            padding: 0 5px;
            margin-bottom: 20px;
            border-radius: 50px;
            position: relative;
            border: rgba(255,255,255,0.2) 2px solid !important;
        }
        .u_user{
            width: 25px;
            height: 25px;
            background: url("http://www.17sucai.com/preview/735710/2017-05-09/1/image/login_ico.png");
            background-position:  -125px 0;
            position: absolute;
            margin: 12px 13px;
        }
        .us_uer{
            width: 25px;
            height: 25px;
            background-image: url("http://www.17sucai.com/preview/735710/2017-05-09/1/image/login_ico.png");
            background-position: -125px -34px;
            position: absolute;
            margin: 12px 13px;
        }

        label{
            color: rgb(255, 255, 255);
            display: block;
        }
        .text{
            width: 220px;
            height: 46px;
            outline: none;
            display: inline-block;
            font: 14px "microsoft yahei",Helvetica,Tahoma,Arial,"Microsoft jhengHei";
            margin-left: 50px;
            border: none;
            background: none;
            line-height: 46px;
        }
        /*///*/
        .mb2{
            margin-bottom: 20px
        }
        .mb2 a{
            text-decoration: none;
            outline: none;
        }
        .submit {
            padding: 15px;
            margin-top: 20px;
            display: block;
        }
        .act-but{
            height: 20px;
            line-height: 20px;
            text-align: center;
            font-size: 20px;
            border-radius: 50px;
            background: #0096e6;
        }


        .login-fgetpwd {
            float: right;
        }


        .checkbox{
            vertical-align: middle;
            margin: 0 5px 0 0;
        }

        .wx img{
            width: 16px;
            height: 16px;
            float: left;
            line-height: 27px;
            text-align: center;
        }
        /*////*/
        .sas{
            width: 280px;
            height: 18px;
            float: left;
            color: #FFFFFF;
            text-align: center;
            font-size: 16px;
            line-height: 16px;
            margin-bottom: 50px;
        }
        .sas a{
            width: 280px;
            height: 18px;
            color: #FFFFFF;
            text-align: center;
            line-height: 18px;
            text-decoration: none;
        }
    </style>
</head>
<body>

<div class="logo_box">
    <h3>欢迎您</h3>
    <form id="form1" action="/my/login" name="f" method="post">
        <div class="input_outer">
            <span class="u_user"></span>
            <input name="userName" class="text" placeholder="输入ID或用户名登录" style="color: #FFFFFF !important" type="text">
        </div>
        <div class="input_outer">
            <span class="us_uer"></span>
            <input name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"  placeholder="请输入密码" type="password">
        </div>
        <input id="message" type="hidden" value="${message}">
        <div class="mb2"><a class="act-but submit" id="sub" style="color: #FFFFFF;cursor: pointer">登录</a></div>
        <input name="savesid" value="0" id="check-box" class="checkbox" type="checkbox"><span>记住用户名</span>
    </form>
    <a href="#" class="login-fgetpwd" style="color: #FFFFFF">忘记密码？</a>


    <div class="sas">
        <a href="#">还没注册账号！</a>
    </div>

</div>
<script>
    $(document).ready(function(){
            if($("#message").val()!=""){
                layer.open({
                    title: "温馨提示"
                    ,content: $("#message").val()
                });
            }
    });
    $("#sub").click(function () {
        $("#form1").submit();
    });
</script>
</body>
</html>
