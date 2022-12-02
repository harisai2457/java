<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanName" class="com.infinite.beandemo.NameBean" scope="page" />
<jsp:setProperty property="firstName" name="beanName"/>
<jsp:setProperty property="lastName" name="beanName"/>
First Name :
<b>
<jsp:getProperty property="firstName" name="beanName"/> </b> <br/>
Last Name :
<b>
<jsp:getProperty property="lastName" name="beanName"/> 
</b>

</body>
</html>