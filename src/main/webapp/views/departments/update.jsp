<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department Update</title>
</head>
<body>
	<h1>Department Update</h1>
	<form action="./updateProcess.jsp">
		<table>
			<tbody>
				<tr>
					<td>
						
					</td>
					<td>
						<input type="hidden" value="<%=request.getParameter("DEPARTMENT_ID") %>" name="department_id" placeholder="아이디를 입력해주세요.">
					</td>
				<tr>
				<tr>
					<td>
						부서명
					</td>
					<td>
						<input type="text" value="<%=request.getParameter("DEPARTMENT_NAME") %>" name="department_name" placeholder="부서명을 입력해주세요.">
					</td>
				<tr>
				<tr>
					<td>
						매니저ID
					</td>
					<td>
						<input type="text" value="<%=request.getParameter("MANAGER_ID") %>" name="manager_id" placeholder="매니저id를 입력해주세요." readonly>
					</td>
				<tr>
				<tr>
					<td>
						위치ID
					</td>
					<td>
						<input type="text" value="<%=request.getParameter("LOCATION_ID") %>" name="location_id" placeholder="위치id를 입력해주세요.">
					</td>
				<tr>
			</tbody>
		</table>
		<button type="submit">제출하기</button>
	</form>
</body>
</html>