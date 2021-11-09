<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main page</title>
<style>
.flex-container-column {
	display: flex;
	flex-direction: column;
}

.flex-container-row {
	display: flex;
	flex-direction: row;
	justify-content: space-around;
}

.flex-container-row>.head {
	flex: 0 0 20em;
	background-color: grey;
}

.flex-container-row>.buttons {
	flex: 1 1 500px;
}

.art_ex {
	background-color: rgb(177, 174, 174);
	margin-top: 1em;
	margin-bottom: 1em;
	margin-left: 1em;
}

.head_1 {
	font-weight: bolder;
	font-size: 30px;
	margin-bottom: 0;
}
</style>

</head>

<body>
	<div class="flex-container-column">
			
		<div class="flex-container-row">
			<div class="head" align="center">
				<p class="head_1">
					<c:out value="News Portal"></c:out>
				</p>
			</div>			
		</div>
	</div>

	<br>
	<a href="news-form">Add news</a>
	<br>

	<c:forEach var="news" items="${newsList}">
	
		<c:url var="openNews" value="news-page">
			<c:param name="newsId" value="${news.id}" />
		</c:url>
		
		<c:url var="deleteNews" value="delete-news">
			<c:param name="newsId" value="${news.id}" />
		</c:url>		
						
				<div>
					<fieldset>
						<legend>${news.title}</legend>				
						<h3 align='center'><c:out value="${news.brief}" /></h3>	
						<a href="${openNews}">Read</a> | 
						<a href="${deleteNews}"> Delete</a>									
					</fieldset>						
				</div>				
		
	</c:forEach>	
		
</body>
</html>