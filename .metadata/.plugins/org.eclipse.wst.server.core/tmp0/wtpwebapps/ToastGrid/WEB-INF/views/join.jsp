<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<html>
<head>
	<title>등록 페이지</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<style type="text/css">
		
	
	</style>
</head>



<body>
	<h1>사원등록</h1>
	
	 <form:form modelAttribute="employeeVO" action="/doJoin" method="post">
		<div class="frmWrap">
			<label for="empName">이름</label><form:input path="empName"/>
			<label for="empAge">나이</label><form:input path="empAge"/>
			<form:select path="empSex">
				<form:option value="M">남성</form:option>
				<form:option value="F">여성</form:option>
			</form:select>
			<button class="btn btn-primary">등록</button>
		</div>
	
	</form:form> 
</body>
</html>

