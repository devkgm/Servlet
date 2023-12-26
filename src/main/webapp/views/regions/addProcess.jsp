<%@page import="java.sql.SQLIntegrityConstraintViolationException"%>
<%@page import="com.devkim.app.regions.RegionDTO"%>
<%@page import="com.devkim.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
	RegionDAO dao = new RegionDAO();
	RegionDTO dto = new RegionDTO();
	int id = Integer.parseInt(request.getParameter("region_id"));
	String name = request.getParameter("region_name");
	dto.setREGION_ID(id);
	dto.setREGION_NAME(name);
	int result=0;
	try{
		result = dao.add(dto);
	} catch(SQLIntegrityConstraintViolationException e){
		System.out.println("SQL 구문 처리 오류");
	}
	

%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Insert title here</title>
    </head>
    <body>
        <h1>Add Process</h1>
        <script type="text/javascript">
        	let result = <%= result%>
        	if (result > 0) {
        		alert("등록 성공")
        	} else {
        		alert("등록 실패")
        	}
        	location.href="./list.jsp";
        </script>
        
    </body>
</html>
