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
<jsp:useBean id="beanBank" class="com.infinite.bank.Bank" scope="page" />
<jsp:setProperty property="*" name="beanBank"/>

First Name :<jsp:getProperty property="firstName" name="beanBank"/> <br/>
Last Name :<jsp:getProperty property="lastName" name="beanBank"/> <br/>
City :<jsp:getProperty property="city" name="beanBank"/>  <br/>
State :<jsp:getProperty property="state" name="beanBank"/> <br/>
Amount :<jsp:getProperty property="amount" name="beanBank"/> <br/>
cheqFacil :<jsp:getProperty property="cheqFacil" name="beanBank"/> <br/>
Account type:<jsp:getProperty property="accountType" name="beanBank"/> <br/>



</body>
</html>