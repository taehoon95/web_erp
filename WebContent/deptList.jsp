<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	${list }
	<h2>부서 목록</h2>
	<table border="1">
		<thead>
			<tr>
				<td>부서 번호</td>
				<td>부서 이름</td>
				<td>부서 위치</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dept" items="${list }">
				<tr>
					<td>${dept.no}</td>
					<td><a href="DeptGetServlet?no=${dept.no}">${dept.name}</a></td>
					<td><a href="DeptGetServlet?no=${dept.no}">${dept.floor}</a></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="3"><a href="deptInput.jsp">부서 추가</a></td>
			</tr>
		</tfoot>
	</table>


</body>
</html>