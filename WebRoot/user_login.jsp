<%@ page contentType="text/html;charset=utf-8" %>
<%@ page errorPage="/common/error.jsp"%>
<%@ page import="com.by.hctm.common.UserRightInfoUtil" %>
<%
	String ckrem  = "" ;
	String ckuser = "" ;
	String ckpwd  = "" ;
	String pwd    = "" ;
	Cookie [] cook = request.getCookies() ;
	if( cook != null ) {
		for(int i=0; i<cook.length; i++ ) {
			if( "jsuser".equals( cook[i].getName() ) ) {
				ckuser = cook[i].getValue() ;
			}else if( "jspwd".equals( cook[i].getName() ) ) {
				ckpwd  = cook[i].getValue() ;
			}else if( "jsrem".equals( cook[i].getName() ) ) {
				ckrem  = cook[i].getValue() ;
			}else if( "pwd".equals( cook[i].getName() ) ) {
				pwd  = cook[i].getValue() ;
			}
		}
	}
	
	if( ! UserRightInfoUtil.timeoutUser(request) ) {
		response.sendRedirect( request.getContextPath() + "/verifyLogin_verify.action" );
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>新宏昌重工集团MIS系统</title>
<link href="index/css.css" rel="stylesheet" type="text/css" />
<!-- <link rel="stylesheet" href="common/css/bootstrap.min.css" /> -->
<!-- <link rel="stylesheet" href="common/css/font-awesome.css" /> -->
<!-- <link rel="stylesheet" href="common/css/unicorn-login.css" /> -->
<link rel='stylesheet' href="common/login/css/index.css"/>
<link rel="stylesheet" href="common/login/css/reset.css"/>
<link rel="stylesheet" href="common/login/css/supersized.css"/>
<link rel="stylesheet" href="common/login/css/style.css"/>
 
  <!-- Javascript -->
<script src="common/login/js/jquery-1.8.2.min.js"></script>
        <script src="common/login/js/supersized.3.2.7.min.js"></script>
        <script src="common/login/js/supersized-init.js"></script>
        <script src="common/login/js/scripts.js"></script>

<script language="javaScript">   
	function CheckForm() {
		var tuname = document.getElementById("ur.j_username") ;
		var tpwd   = document.getElementById("ur.j_password") ;
		if(tuname.value=="") {
			alert("请输入用户名称");
			tuname.focus();
			return false;
		}
		
		if(tpwd.value=="") {
			alert("请输入用户密码");
			tpwd.focus();
			return false;
		} 
		
	  	document.forms["loginform"].action="verifyLogin_verify.action";
	  	document.forms["loginform"].submit();			
	}
	function doReset(){
		document.getElementById("ur.j_username").value="";
		document.getElementById("ur.j_password").value="";
	}
	function checkedIfRem(){
		if(!document.getElementById("ifRem").checked){
			document.getElementById("ifPwd").checked=false;
		}
	}
	function checkedIfPwd(){
		if(document.getElementById("ifPwd").checked){
			document.getElementById("ifRem").checked=true;
		}
	}
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
		  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
		  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

		  ga('create', 'UA-44987299-1', 'bootstrap-hunter.com');
		  ga('send', 'pageview');
</script>
</head>


    <body>

        <div class="page-container">
            <h1>新宏昌订单系统</h1>
            <form  id="loginform"  method="post">
            <input   name="ur.j_username" id="ur.j_username"  class="username"  type="text"     value="<%= ckuser %>" /> 
<!--                 <input type="text" name="username" class="username" placeholder="Username"> -->
<!--                 <input type="password" name="password" class="password" placeholder="Password"> -->
            <input name="ur.j_password" id="ur.j_password" tabindex="2" value="<%= ckpwd %>" class="password" type="password"    />
                <button type="submit" onclick="CheckForm();" >登陆</button>
                <div class="error"><span>+</span></div>
            </form> 
        </div>

      
    </body>

</html>


	 
<!-- <body style="overflow-x:hidden:overflow-y:hidden"  onkeypress="if(event.keyCode==13) CheckForm();" > -->
<!--    <div id="container"> -->
<!--             <div id="logo"> -->
<!--                 <img src="common/img/logo.png" alt="" />  -->
<!--                <img src="common/img/1234.png" alt="" /> -->
<!--             </div> -->
<!--             <div id="user"> -->
<!--                 <div class="avatar"> -->
<!--                     <div class="inner"></div> -->
<!--                     <img src="common/img/demo/av1_1.jpg" /> -->
<!--                 </div> -->
<!--                 <div class="text"> -->
<!--                     <h4>Hello,<span class="user_name"></span></h4> -->
<!--                 </div> -->
<!--             </div> -->
<!--             <div id="loginbox">             -->
<!--                 <form id="loginform" method="post"> -->
<!--     				<p>Enter username and password to continue.</p> -->
<!--                     <div class="input-group input-sm"> -->
<!--                         <span class="input-group-addon"><i class="fa fa-user"></i></span><input   name="ur.j_username" id="ur.j_username" class="form-control" type="text"  placeholder="Username"  value="<%= ckuser %>" /> -->
<!--                     </div> -->
<!--                     <div class="input-group"> -->
<!--                         <span class="input-group-addon"><i class="fa fa-lock"></i></span><input name="ur.j_password" id="ur.j_password" tabindex="2" value="<%= ckpwd %>" class="form-control" type="password"   placeholder="Password" /> -->
<!--                     </div> -->
<!--                     <div class="form-actions clearfix"> -->
<!--                         <div class="pull-left"> -->
<!--                             <a href="#registerform" class="flip-link to-register blue">创建新账户</a> -->
<!--                         </div> -->
<!--                         <div class="pull-right"> -->
<!--                             <a href="#recoverform" class="flip-link to-recover grey">忘记 密码 ?</a> -->
<!--                         </div> -->
<!--                         <input type="submit" class="btn btn-block btn-primary btn-default" onclick="CheckForm();" value="登录" /> -->
<!--                     </div> -->

<!--                 </form> -->
<!--                 <form id="recoverform" action="#"> -->
<!--     				<p>Enter your e-mail address below and we will send you instructions how to recover a password.</p> -->
<!--     				<div class="input-group"> -->
<!--                         <span class="input-group-addon"><i class="fa fa-envelope"></i></span><input class="form-control" type="text" placeholder="E-mail address" /> -->
<!--                     </div> -->
<!--                     <div class="form-actions clearfix"> -->
<!--                         <div class="pull-left"> -->
<!--                             <a href="#loginform" class="grey flip-link to-login">Click to login</a> -->
<!--                         </div> -->
<!--                         <div class="pull-right"> -->
<!--                             <a href="#registerform" class="blue flip-link to-register">Create new account</a> -->
<!--                         </div> -->
<!--                         <input type="submit" class="btn btn-block btn-inverse" value="Recover" /> -->
<!--                     </div> -->
<!--                 </form> -->
<!--                 <form id="registerform" action="#"> -->
<!--                     <p>Enter information required to register:</p> -->
<!--                     <div class="input-group"> -->
<!--                         <span class="input-group-addon"><i class="fa fa-user"></i></span><input  class="form-control" type="text" placeholder="Enter Username"   /> -->
<!--                     </div> -->
<!--                     <div class="input-group"> -->
<!--                         <span class="input-group-addon"><i class="fa fa-lock"></i></span><input class="form-control" type="password" placeholder="Choose Password" /> -->
<!--                     </div> -->
<!--                     <div class="input-group"> -->
<!--                         <span class="input-group-addon"><i class="fa fa-lock"></i></span><input class="form-control" type="password" placeholder="Confirm password" /> -->
<!--                     </div> -->
<!--                     <div class="input-group"> -->
<!--                         <span class="input-group-addon"><i class="fa fa-envelope"></i></span><input class="form-control" type="text" placeholder="Enter E-mail address" /> -->
<!--                     </div> -->
<!--                     <div class="form-actions clearfix"> -->
<!--                         <div class="pull-left"> -->
<!--                             <a href="#loginform" class="grey flip-link to-login">Click to login</a> -->
<!--                         </div> -->
<!--                         <div class="pull-right"> -->
<!--                             <a href="#recoverform" class="grey flip-link to-recover">Lost password?</a> -->
<!--                         </div> -->
<!--                         <input type="submit" class="btn btn-block btn-success" value="Register" /> -->
<!--                     </div> -->
<!--                 </form> -->
<!--             </div> -->
             
<!--         </div> -->
      
      
<!--         <script src="common/script/js/jquery.min.js"></script>   -->
<!--         <script src="common/script/js/jquery-ui.custom.min.js"></script> -->
<!--         <script src="common/script/js/unicorn.login.js"></script>  -->
 
<!-- </body> -->
<!-- </html> -->

