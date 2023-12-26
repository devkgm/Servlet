<%@page import="com.devkim.app.regions.RegionDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.devkim.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
	RegionDAO regionDAO = new RegionDAO();
	List<RegionDTO> list =regionDAO.getList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Regions List</h1>
	<table>
		<thead>
			<tr>
				<th>REGION_ID</th><th>REGION_NAME</th>
			</tr>
		</thead>	
		<tbody>
		
			<%for(RegionDTO dto: list){%>
				<tr>
					<td><%= dto.getREGION_ID() %></td>
					<td><a href="./detail.jsp?id=<%= dto.getREGION_ID() %>"><%= dto.getREGION_NAME() %></a></td>
				</tr>
			<%}%>
		
		</tbody>
	</table>
</body>
</html>