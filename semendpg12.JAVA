session.jsp
<html>
<head>
<title>mad</title>
</head>
<body>
<center>
<form action="http://localhost:8080/jsp/session1.jsp" method="get">
enter name:<input type="text" name="uname"><br>
<input type="submit" value="login">
</form>
</center>
</body>
</html>

session1.jsp
<%@page language="java" import="java.util.*" errorPage=""%>
<form action="http://localhost:8080/jsp/session2.jsp" method="get">

<% Date d=new Date();%>
<p align="right" >time:<%=d.getTime();%></p>
<%
String un=request.getParameter("uname");
session.setAttribute("user",un);
seesion.setAttribute("time",d.getTime());
%>
helo<%=un%><br><br>
<input type="submit" value="logout">
</form>

session2.jsp

<%@page language="java" import="java.util.*" errorPage=""%>

<% Date d2=new Date();
String un=(String)session.getAttribute("user");
Long t1=(Long)session.getAttribute("time");
Long t2=d2.getTime();
%>
thank you<%=un%><br><br>
sesseion duration:<%=(t2-t1)/(3600)%>seconds
<%session.invalidate();%>
