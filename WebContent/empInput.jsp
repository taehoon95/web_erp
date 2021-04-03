<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 추가</title>
</head>
<body>
	<fieldset class="insertTitle">
		<legend>사원 추가</legend>
		<form action="EmpInsertServlet" method="post">
			<label for="no">사원 번호 :</label> 
			<input type="number" name="empNo"id="no"> <br> 
			
			<label for="name">사원 이름 :</label> 
			<input type="text" name="empName" id="name"> <br>
			
			<label for="titile">사원 직책 :</label> 
			<input type="text" name="title" id="title"> <br>
			
			<label for="manager">직속 상사 :</label> 
			<input type="number" name="manager" id="manager"> <br> 
			
			<label for="salary">사원 월급 :</label> 
			<input type="text" name="salary" id="salary"> <br>
			
			<label for="dept">사원 부서 :</label> 
			<input type="text" name="dept" id="dept"> <br> 
			
			<input type="submit" value="등록"> <input type="submit" value="취소">
		</form>
	</fieldset>
</body>
</html>