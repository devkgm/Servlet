<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department Add</title>
</head>
<body>
	<form action="./addProcess.jsp">
		<table>
			<tbody>
				<tr>
					<td>
						아이디
					</td>
					<td>
						<input type="text" name="department_id" placeholder="아이디를 입력해주세요.">
					</td>
				<tr>
				<tr>
					<td>
						부서명
					</td>
					<td>
						<input type="text" name="department_name" placeholder="부서명을 입력해주세요.">
					</td>
				<tr>
				<tr>
					<td>
						매니저ID
					</td>
					<td>
						<input type="text" name="manager_id" placeholder="매니저id를 입력해주세요.">
					</td>
				<tr>
				<tr>
					<td>
						위치ID
					</td>
					<td>
						<input type="text" name="location_id" placeholder="위치id를 입력해주세요.">
					</td>
				<tr>
			</tbody>
		</table>
		<button type="submit">제출하기</button>
	</form>
</body>
</html>