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
<form method="get" action="EmployDelete.jsp">
		<center>
			Employ No : 
			<input type="number" value="empno" /> <br/><br/>
			
			<input type="submit" value="Delete" />
		</center>
	</form>
	<c:if test="${param.basic!=null}">
		<sql:setDataSource var="conn" 
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/infinite"
	user="root"
	password="india@123"
/>
<sql:update var="employDelete" dataSource="${conn}">
	Insert into Employ(Name,Dept,Desig,Basic) values(?,?,?,?)
	
</sql:update>
	</c:if>


</body>
</html>