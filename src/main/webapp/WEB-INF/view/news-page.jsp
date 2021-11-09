<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>News Page</title>

</head>
<body>
	<a href="news-list">Back to main page</a> <br>	
		
	<h1 align="center"><c:out value="${news.title}"></c:out></h1>
	<h3 align="center"><c:out value="${news.content}"></c:out></h3>
	<p><c:out value="News ID: ${news.id}" /></p>
		
	<form:form action="add-news" modelAttribute="news" method="POST">
		
		<form:hidden path="id"/>		
		<fieldset>
			<legend>News redactor</legend>
			<form:input path="title"/> <br>
			<form:textarea path="brief" cols="50" rows="5"/> <br>
			<form:textarea path="content" cols="50" rows="20"/> <br>
			<input type="submit" value="Save" class="save" >
		</fieldset>
				
	</form:form>	
	
	<a href="delete-news?newsId=${news.id}">Delete</a>	
	
</body>
</html>