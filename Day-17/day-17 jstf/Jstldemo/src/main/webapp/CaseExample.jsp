<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="n" value="1" />
<c:choose>
<c:when test="${n==1}">
 <c:out value="Hi I am Hari"/>
 </c:when>
 <c:when test="${n==2}">
 <c:out value="Hi I am Sai"/>
 </c:when>
 <c:when test="${n==3}">
 <c:out value="Hi I am siri"/>
 </c:when>
 <c:when test="${n==4}">
 <c:out value="Hi I am srav"/>
 
 </c:when>
 <c:otherwise>
 <c:out value="Invalid value..."/>
 </c:otherwise>
 </c:choose>


</body>
</html>