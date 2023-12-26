<%@page import="com.devkim.app.regions.RegionDTO"%>
<%@page import="com.devkim.app.regions.RegionDAO"%>
<%@page import="com.devkim.app.departments.DepartmentDTO"%>
<%@page import="com.devkim.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	int id = Integer.parseInt(request.getParameter("id"));
    	RegionDAO dao = new RegionDAO();
    	RegionDTO dto = new RegionDTO();
    	dto.setREGION_ID(id);
    	int result = 0;
    	try{
    		result = dao.delete(dto);
    	} catch (Exception e) {
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
		let result = <%= result %>;
		if(result > 0){
			alert("삭제 성공");
		} else {
			alert("삭제 실패");
		}
		location.href = "./list.jsp";
	</script>
</body>
</html>