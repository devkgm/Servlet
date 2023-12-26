<%@page import="com.devkim.app.departments.DepartmentDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.devkim.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	DepartmentDAO departmentDAO = new DepartmentDAO();
	List<DepartmentDTO> list = departmentDAO.getList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Department List</h1>
	<table border="1">
		<thead>
			<tr>
				<th>DEPARTMENT_NAME</th>
			</tr>
		</thead>	
		<tbody>
			<%for(DepartmentDTO dto: list){%>
				<tr>
				
					<td><a href="./detail.jsp?id=<%= dto.getDEPARTMENT_ID() %>"><%= dto.getDEPARTMENT_NAME() %></td>

				</tr>
			<%}%>
		</tbody>
	</table>
</body>
</html>