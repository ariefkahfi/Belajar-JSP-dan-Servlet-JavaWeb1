<%--
  Created by IntelliJ IDEA.
  User: Arief
  Date: 9/7/2017
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello JSP</title>
  </head>

    <style>
      a{
        display: block;
      }
    </style>

  <body>


  <%!
    public String myMappingUrl(String servletMappingName){
        return "/arief/"+servletMappingName ;
    }
  %>



  <a href="<%=myMappingUrl("servlet-one")%>">
    Go to Servlet one
  </a>

  <a href="<%=myMappingUrl("servlet-two")%>">
    Go to Servlet two
  </a>

  <a href="webPages/hello.jsp">
    Go to hello JSP page
  </a>

  <a href="webPages/person/form-person.jsp">
    Go to Form Person
  </a>


  </body>
</html>
