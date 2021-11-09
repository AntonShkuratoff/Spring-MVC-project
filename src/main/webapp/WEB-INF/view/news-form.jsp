<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>News Form</title>

</head>
<body>
	<a href="news-list">Back to main page</a> <br>	
		
	<form:form action="add-news" modelAttribute="news" method="POST">				
		<fieldset>
			<legend>News redactor</legend>
			<form:input path="title"/> <br>
			<form:textarea path="brief" cols="50" rows="5"/> <br>
			<form:textarea path="content" cols="50" rows="20"/> <br>
			<input type="submit" value="Save" class="save" >
		</fieldset>
				
	</form:form>
	
</body>
</html>