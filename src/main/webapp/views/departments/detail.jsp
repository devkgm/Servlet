<%@page import="com.devkim.app.departments.DepartmentDTO"%>
<%@page import="com.devkim.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	DepartmentDAO departmentDAO = new DepartmentDAO();
	DepartmentDTO departmentDTO = new DepartmentDTO();
	String id = request.getParameter("id");
	departmentDTO.setDEPARTMENT_ID(Integer.parseInt(id));
	departmentDTO = departmentDAO.getDetail(departmentDTO);
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department Detail</title>
</head>
<body>
	<h1>Department Detail</h1>
	<table border="1">
		<thead>
			<tr>
				<th>DEPARTMENT_ID</th>
				<th>DEPARTMENT_NAME</th>
				<th>LOCATION_ID</th>
				<th>MANAGER_ID</th>
			</tr>
		</thead>	
		<tbody>
			<tr>
				<td><%= departmentDTO.getDEPARTMENT_ID() %></td>
				<td><%= departmentDTO.getDEPARTMENT_NAME() %></td>
				<td><%= departmentDTO.getLOCATION_ID() %></td>
				<td><%= departmentDTO.getMANAGER_ID() %></td>
			</tr>
		</tbody>
	</table>

</body>
</html>