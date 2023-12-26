<%@page import="com.devkim.app.regions.RegionDTO"%>
<%@page import="com.devkim.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	RegionDAO regionDAO = new RegionDAO();
	RegionDTO regionDTO = new RegionDTO();
	int id = Integer.parseInt(request.getParameter("region_id"));
	String name = request.getParameter("region_name");
	regionDTO.setREGION_ID(id);
	regionDTO.setREGION_NAME(name);
	int result = 0;
	try{
		result = regionDAO.update(regionDTO);
	} catch(Exception e) {
		e.printStackTrace();
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		let result = <%= result %>
		if(result > 0){
			alert("수정 성공");
		} else {
			alert("수정 실패");
		}
		location.href="./list.jsp";
	</script>
</body>
</html>