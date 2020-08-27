<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13008
  Date: 2020/8/26
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>查询报表</title>
</head>
<body>
<c:if test="${account!=null}" >
<div> <span>${account},您好<a href="logout">logout</a></span>
    <div>
        </c:if>
<div>
    <div>
        <ul>
            <li><a href="insert">销售记录录入数据</a></li>
            <li>报表查询</li>
        </ul>
    </div>
    <div>
        <div>
         <p>销售数据</p>
        </div>
        <div>
            <form action="select" method="post">
                <ul>
                    <li>
                        <p>销售姓名</p>
                        <select name="saleName">
                            <c:forEach items="${saleName}" var="sale">
                                <option value="${sale}">${sale}</option>
                            </c:forEach>
                        </select>
                    </li>
                    <li>
                        <p>债券类型</p>
                        <select name="saleKind">
                            <c:forEach items="${saleKind}" var="sale">
                                <option value="${sale}">${sale}</option>
                            </c:forEach>
                        </select>
                    </li>
                    <li>
                        <p>开始日期</p>
                        <input type="date" name="startDate">
                    </li>
                    <li>
                        <p>结束日期</p>
                        <input type="date" name="endDate">
                    </li>
                    <input type="submit" value="查询">
                </ul>
            </form>
        </div>
        <c:if test="${selectResult!=null}">
            <div>
                <table>
                    <thead>
                    <tr>
                        <th>id</th>
                        <th>姓名</th>
                        <th>债权类型</th>
                        <th>交易时间</th>
                        <th>交易金额</th>
                    </tr>
                    </thead>
                    <c:forEach items="${selectResult}" var="sale">
                        <tbody>
                        <tr>
                            <td>${sale.id}</td>
                            <td>${sale.saleName}</td>
                            <td>${sale.saleKind}</td>
                            <td>${sale.date}</td>
                            <td>${sale.money}</td>
                        </tr>
                        </tbody>
                    </c:forEach>
                </table>
            </div>
        </c:if>
    </div>
</div>


</body>
</html>
