<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 수정</title>
</head>
<body>
<form action="EmpUpdateServlet">
	<fieldset class="insertTitle">
		<legend>사원 삭제,수정</legend>
		<ul>
			<li>
				<label for="empNo">사원 번호 :</label>
				<input type="number" name="empNo"id="empNo"  value="${param.empNo}"> <br>
			</li>
			<li>
				<label for="tName">사원 이름 :</label>
				<input type="text" name="empName" id="name" value="${param.empName}"> <br>
			</li>
			<li>
				<label for="title">사원 직책 :</label>
				<input type="text" name="title" id="title" value="${param.title}"> <br>
			</li>
			<li>
				<label for="manager">직속 상사 :</label>
				<input type="text" name="manager" id="manager" value="${param.manager}"> <br>
			</li>
			<li>
				<label for="salary">사원 월급 :</label>
				<input type="text" name="salary" id="salary" value="${param.salary}"> <br>
			</li>
			<li>
				<label for="dept">사원 부서 :</label>
				<input type="text" name="dept" id="dept" value="${param.dept}"> <br>
			</li>
			<li>
				<input type = "submit" value="수정"/>
			</li>
		</ul>
	</fieldset>
</form>
</body>
</html>