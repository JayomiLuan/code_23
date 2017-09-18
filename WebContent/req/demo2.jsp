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
		//向request范围添加一个属性，名为msg，如果msg已存在，则触发replace事件
		String msg = "replaced value";
		request.setAttribute("msg",msg);

		//从request范围删除一个属性，名为msg
		request.removeAttribute("msg");

	%>
	${msg }

</body>
</html>