<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="TitleUpdateServlet">
		<fieldset class="insertTitle">
			<legend>직책 수정</legend>
			<ul>
				<li><label for="tNo">직책번호 :</label>
				<input type="number"name="no" id="tNo" value="${param.no}"> <br></li>
				<li><label for="tName">직책이름 :</label> 
				<input type="text" name="name" id="tName" value="${param.name}"> <br></li>
				<li><input type = "submit" value="수정"/></li>
			</ul>
		</fieldset>
	</form>
</body>
</html>