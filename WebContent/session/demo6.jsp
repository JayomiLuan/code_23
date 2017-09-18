<%@page import="cn.itcast.day23.domain.Category"%>
<%@page import="cn.itcast.day23.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//在Session中保存一个Category对象，之后正常关闭服务回
		//Session中的Category对象应该是被序列化到磁盘
		session.setAttribute("cate001" , new Category("category001","phone") );
	%>


</body>
</html>