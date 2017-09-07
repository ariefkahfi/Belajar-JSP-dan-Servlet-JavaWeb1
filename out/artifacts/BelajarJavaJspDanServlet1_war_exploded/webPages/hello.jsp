<%--
  Created by IntelliJ IDEA.
  User: Arief
  Date: 9/7/2017
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello JSP</title>
</head>
<style>
    a{
        display : block;
    }
</style>
<body>

<%
    String contextPath = request.getContextPath();
%>


    <a href="<%=contextPath%>/servlet-one">
        Go to servlet one
    </a>

    <a href="<%=contextPath%>/servlet-two">
        Go to servlet two
    </a>



    <a href="<%=contextPath%>/index.jsp">
       Back to index JSP
    </a>

</body>
</html>
