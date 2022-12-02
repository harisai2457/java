<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/infinite"
user="root"
password="india@123"
/>
<sql:query var="employQuery" dataSource="${conn}">
select * from Employ

</sql:query>
<table border="3" align="center">
<tr>
<th>Employ No</th>
<th>Employ Name</th>
<th>Department</th>
<th>Designation</th>
<th>Basic</th>
</tr>
<tr>
<c:forEach var ="employ" items="${employQuery.rows}">
<td><c:out value="${employ.empno}" /></td>
<td><c:out value="${employ.empname}" /></td>
<td><c:out value="${employ.dept}" /></td>
<td><c:out value="${employ.design}" /></td>
<td><c:out value="${employ.basic}" /></td>
</tr>
</c:forEach>

</table>

</body>
</html>