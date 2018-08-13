<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Баранов
  Date: 22.05.2018
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Менеджер заказов</title>
  </head>
  <body>
  <h3>Blank</h3>
  <br>
  <a href="<c:url value="/users"/>" target="_blank">Books list</a>
  <h3>parent</h3>
  <br>
    <a href="/WEB-INF/pages/user.jsp" target="_parent">Создать пользователя</a>
  <h3>self</h3>
  <br>
  <a href="<c:url value="/products"/>" target="_blank">Создать номенклатуру</a>
  <h3>top</h3>
  <br>
  <a href="product.jsp" target="_top">Создать номенклатуру</a>

  </body>
</html>
