<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 삭제,수정</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<fieldset class="insertTitle">
		<legend>부서 삭제,수정</legend>
		<ul>
			<li>
				<label for="no">부서 번호 :</label>
				<input type="number" name="no"id="no"  value="${dept.no}"> <br>
			</li>
			<li>
				<label for="name">부서 이름 :</label>
				<input type="text" name="name" id="name" value="${dept.name}"> <br>
			</li>
			<li>
				<label for="floor">부서 번호 :</label>
				<input type="number" name="floor"id="floor"  value="${dept.floor}"> <br>
			</li>
			<li>
				<a href="DeptDelServlet?no=${dept.no}">삭제</a>
				<a href="DeptUpdate.jsp?no=${dept.no}&name=${dept.name}&floor=${dept.floor}">수정</a>
			</li>
		</ul>
	</fieldset>
</body>
</html>