<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 리스트</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	${list }
	<h2>부서 목록</h2>
	<table border="1">
		<thead>
			<tr>
				<td>사원 번호</td>
				<td>사원 이름</td>
				<td>사원 직책</td>
				<td>직속 상사</td>
				<td>사원 월급</td>
				<td>사원 부서</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${list }">
				<tr>
					<td>${emp.empNo}</td>
					<td><a href="EmpGetServlet?empNo=${emp.empNo}">${emp.empName}</a></td>
					<td><a href="EmpGetServlet?empNo=${emp.empNo}">${emp.title.no}</a></td>
					<td><a href="EmpGetServlet?empNo=${emp.empNo}">${emp.manager.empNo}</a></td>
					<td><a href="EmpGetServlet?empNo=${emp.empNo}">${emp.salary}</a></td>
					<td><a href="EmpGetServlet?empNo=${emp.empNo}">${emp.dept.no}</a></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="6"><a href="empInput.jsp">사원 추가</a></td>
			</tr>
		</tfoot>
	</table>
</body>
</html>