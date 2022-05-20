<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>c:forTokens 标签实例</title>
</head>
<body>
<%--<tr>--%>
<%--    <c:forEach var="i" begin="1" end="5">--%>
<%--<td>123</td>--%>
<%--        <td>123</td>--%>
<%--        <td>123</td>--%>
<%--    </c:forEach>--%>
<%--</tr>--%>
<table>
    <tr><th>名字</th><th>名字</th><th>名字</th></tr>
    ${product.nameCn}
    1111111
<c:forEach var="i" items="${list}">
    <tr>
${product.nameCn}
        ${product}
            <td>${i.userId}</td>
        <td>${i.userId}</td>
        <td>${i.userId}</td>

    </tr>

</c:forEach>
</table>

</body>
</html>