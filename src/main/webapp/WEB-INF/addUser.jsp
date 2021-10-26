<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add user</title>
</head>
<body>
	<div>
	<form method="POST" action="/addUser">
		<div>
			<c:out value="${errorMessage}"></c:out>
		</div>
		<div>
			<label for="name">Name</label> <input type="text" name="name"
				id="name">
		</div>
		<div>
			<label for="location">Dojo Location</label> <select name="location"
				id="location">
				<option value="San Jose">San Jose</option>
				<option value="Heredia">Heredia</option>
				<option value="Cartago">Cartago</option>
			</select>
		</div>
		<div>
			<label for="language">Favorite Language</label> <select
				name="language" id="language">
				<option value="Python">Python</option>
				<option value="Java">Java</option>
				<option value="Javascript">Javascript</option>
			</select>
		</div>
		<div>
			<label for="comment">Comments:</label>
			<textarea name="comment" id="comment" cols="20" rows="10"></textarea>
		</div>
		<div>
			<button type="submit">Add User</button>
		</div>
	</form>
	</div>

</body>
</html>