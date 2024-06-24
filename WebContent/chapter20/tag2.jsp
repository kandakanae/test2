<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<jsp:useBean id="product" class="bean.Product" />
<%-- <jsp:useBean id="product" class="bean.Product" scope="session" /> --%>

<jsp:setProperty property="id" name="product" value="2"/>
<jsp:setProperty property="name" name="product" value="サーモン"/>
<jsp:setProperty property="price" name="product" value="100"/>


<jsp:getProperty property="id" name="product"/>
<jsp:getProperty property="name" name="product"/>
<jsp:getProperty property="price" name="product"/>

<%@include file="../footer.html" %>
