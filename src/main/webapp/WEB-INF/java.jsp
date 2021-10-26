<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link rel="stylesheet" href="./css/index.css">
</head>
<body>
	<div class="container">
		<h1>You chose Java!!</h1>
		<h1>Submitted Info</h1>
			<div>
				<p>Name: <c:out value="${user.getName()}"></c:out> </p>
				<p>Dojo Location: <c:out value="${user.getLocation()}"></c:out> </p>
				<p>Favorite Language: <c:out value="${user.getLanguage()}"></c:out> </p>
				<p>Comment: <c:out value="${user.getComment()}"></c:out> </p>
			</div>
	</div>
</body>
</html>