<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset class="insertTitle">
		<legend>사원 삭제,수정</legend>
		<ul>
			<li>
				<label for="tNo">사원 번호 :</label>
				<input type="number" name="empNo"id="tNo"  value="${emp.empNo}"> <br>
			</li>
			<li>
				<label for="tName">사원 이름 :</label>
				<input type="text" name="name" id="tName" value="${emp.empName}"> <br>
			</li>
			<li>
				<label for="tName">사원 직책 :</label>
				<input type="text" name="title" id="tName" value="${emp.title.no}"> <br>
			</li>
			<li>
				<label for="tName">직속 상사 :</label>
				<input type="text" name="manager" id="tName" value="${emp.manager.empNo}"> <br>
			</li>
			<li>
				<label for="tName">사원 월급 :</label>
				<input type="text" name="salary" id="tName" value="${emp.salary}"> <br>
			</li>
			<li>
				<label for="tName">사원 부서 :</label>
				<input type="text" name="dept" id="tName" value="${emp.dept.no}"> <br>
			</li>
			<li>
				<a href="EmpDelServlet?empNo=${emp.empNo}">삭제</a>
				<a href="EmpUpdate.jsp?empNo=${emp.empNo}
							&empName=${emp.empName}
							&title=${emp.title.no}
							&manager=${emp.manager.empNo}
							&salary=${emp.salary}
							&dept=${emp.dept.no}">수정</a>
			</li>
		</ul>
	</fieldset>
</body>
</html>