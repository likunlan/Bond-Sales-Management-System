<%@ page import="demo.citi.pojo.SaleInfo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13008
  Date: 2020/8/24
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<html>
<head>

	<meta charset="UTF-8">
<title>登录成功</title>
</head>
<body>
	<c:if test="${account!=null}" >
	<div> <span>${account},您好<a href="logout">logout</a></span>
		<div>
	</c:if>
<%--显示数据是否已经插入--%>
		<c:if test="${saleInfo!=null}">
		<div>
			<span>{ ${saleInfo.saleName}-${saleInfo.saleKind}-${saleInfo.date}-${saleInfo.money} }
			的数据已经插入
			</span>
		</div>
		</c:if>
<div>
	<div>
		<ul>
			<li>销售记录录入数据</li>
			<li><a href="select">报表查询</a></li>
		</ul>
	</div>
	<div>
		<form action="insert" method="post">
			<ul>
				<li>
					<p>销售姓名</p>
					<select name="saleName">
						<c:forEach items="${saleName}" var="sales">
						<option value="${sales}" >${sales}</option>
						</c:forEach>
					</select>
				</li>
				<li>
					<p>债务类型</p>
					<select name="saleKind">
						<c:forEach items="${saleKind}" var="kind">
							<option value="${kind}">${kind}</option>
						</c:forEach>
					</select>
				</li>
				<li>
					<p>日期</p>
					<input type="date" value="2020-08-26" name="date">
				</li>
				<li>
					<p>销售金额</p>
					<input type="text" value="200" name="money">
				</li>
			</ul>
			<input type="submit" value="自动提交">
		</form>

	</div>
</div>
</body>
</html>
