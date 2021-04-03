<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 추가</title>
</head>
<body>
	<fieldset class="insertTitle">
		<legend>부서 추가</legend>
		<form action="DeptInsertServlet" method="post">
			<label for="no">부서 번호 :</label> 
			<input type="number" name="no"id="no"> <br> 
			<label for="tName">부서 이름 :</label> 
			<input type="text" name="name" id="name"> <br>
			<label for="tName">부서 위치 :</label> 
			<input type="text" name="floor" id="floor"> <br> 
			<input type="submit" value="등록"> <input type="submit" value="취소">
		</form>
	</fieldset>
</body>
</html>