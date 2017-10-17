
<%@page import="com.wzmusic.bean.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Success</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%
	request.setCharacterEncoding("utf-8");
	List<Student> stu = (List<Student>) request.getAttribute("student");
	String s1=(String)request.getAttribute("hh1");
	String guida=(String)request.getAttribute("guida");
%>
</head>

<body>
	<table>
	
		<th>
			<td>编号</td>
			<td>姓名</td>
			<td><%=request.getSession().getAttribute("user") %></td>
		</th>
		<%for(Student s:stu){ %>
		<tr>
			<td><%=s.getId() %></td>
			<td><%=s.getName() %></td>
			<td><%=s.getAge() %></td>
		</tr>
		<%} %>
	</table>
	<%=s1 %>
	<%=guida %>
</body>
</html>
