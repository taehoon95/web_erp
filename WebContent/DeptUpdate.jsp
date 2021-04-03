<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 수정</title>
</head>
<body>
<form action="DeptUpdateServlet">
<fieldset class="insertTitle">
		<legend>부서 수정</legend>
		<ul>
			<li>
				<label for="no">부서 번호 :</label>
				<input type="number" name="no"id="no"  value="${param.no}"> <br>
			</li>
			<li>
				<label for="name">부서 이름 :</label>
				<input type="text" name="name" id="name" value="${param.name}"> <br>
			</li>
			<li>
				<label for="floor">부서 위치 :</label>
				<input type="number" name="floor"id="floor"  value="${param.floor}"> <br>
			</li>
			<li>
				<input type = "submit" value="수정"/>
			</li>
		</ul>
	</fieldset>
</form>
</body>
</html>