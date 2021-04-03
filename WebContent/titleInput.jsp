<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직책 추가</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<fieldset class="insertTitle">
		<legend>직책 추가</legend>
		<form action="TItleInsertServlet" method="post">
			<label for="tNo">직책번호 :</label> 
			<input type="number" name="tNo"id="tNo"> <br> 
			<label for="tName">직책이름 :</label> 
			<input type="text" name="tName" id="tName"> <br> 
			<input type="submit" value="등록"> <input type="submit" value="취소">
		</form>
	</fieldset>
</body>
</html>