<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<jsp:useBean id="product" class="bean.Product" scope="request" />
<%-- <jsp:useBean id="product" class="bean.Product" scope="session" /> --%>


<p>
<jsp:getProperty property="id" name="product"/>
<jsp:getProperty property="name" name="product"/>
<jsp:getProperty property="price" name="product"/>
</p>

<%@include file="../footer.html" %>
