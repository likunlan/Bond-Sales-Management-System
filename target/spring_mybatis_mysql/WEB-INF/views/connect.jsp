<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: 13008
  Date: 2020/8/25
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie:cookies
         ) {
        out.println(cookie.getName());
        out.println(cookie.getValue());
    }
    out.println("_________________________________");
    Enumeration attributeNames = session.getAttributeNames();
    while(attributeNames.hasMoreElements()){
        String value=(String) attributeNames.nextElement();
        out.println(value);
        out.println(session.getAttribute(value));
    }
    session.setAttribute("faxuexiaoxin","123456789");
    out.println("_________________________________");
//    attributeNames = session.getAttributeNames();
//    while(attributeNames.hasMoreElements()){
//        out.println(attributeNames.nextElement());
//        out.println(session.getAttribute(attributeNames.nextElement().toString()));
//    }
%>
</body>
</html>
