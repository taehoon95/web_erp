<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직책 삭제, 수정</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<fieldset class="insertTitle">
		<legend>직책 삭제,수정</legend>
		<ul>
			<li>
				<label for="tNo">직책번호 :</label>
				<input type="number" name="no"id="tNo"  value="${title.no}"> <br>
			</li>
			<li>
				<label for="tName">직책이름 :</label>
				<input type="text" name="name" id="tName" value="${title.name}"> <br>
			</li>
			<li>
				<a href="TitleDelServlet?no=${title.no}">삭제</a>
				<a href="TitleUpdate.jsp?no=${title.no}&name=${title.name}">수정</a>
			</li>
		</ul>
	</fieldset>
</body>
</html>