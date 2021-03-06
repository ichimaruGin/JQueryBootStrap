<%@ page language="java" contentType="text/html; charset=utf-8" 
    pageEncoding="utf-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1" user-scalable=no>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/bootstrap.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resource/css/signin.css"> 
<link rel="shortcut icon" href="<%=request.getContextPath()%>/resource/icon/sun_stroke.png" />
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/javascript/jquery-1.11.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/javascript/bootstrap.js"></script>
<title>欢迎</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="<%=request.getContextPath()%>/">BootStrap</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="<%if(request.getAttribute("navi_foucs").equals("login"))out.write("active");else out.write("");%>"><a href="<%=request.getContextPath()%>/login">登陆</a></li>  <!-- class="active" -->
            <li class="<%if(request.getAttribute("navi_foucs").equals("mainpage"))out.write("active");else out.write("");%>"><a href="<%=request.getContextPath()%>/login/check">主页</a></li>
            <li class="<%if(request.getAttribute("navi_foucs").equals("about"))out.write("active");else out.write("");%>"><a href="<%=request.getContextPath()%>/about.jsp">关于</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>	
