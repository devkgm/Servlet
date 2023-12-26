<%@page import="com.devkim.app.departments.DepartmentDAO"%>
<%@page import="com.devkim.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	DepartmentDAO departmentDAO = new DepartmentDAO();
	DepartmentDTO departmentDTO = new DepartmentDTO();
	int department_id =Integer.parseInt(request.getParameter("department_id"));
	String department_name = request.getParameter("department_name");
	int manager_id =Integer.parseInt(request.getParameter("manager_id"));
	int location_id =Integer.parseInt(request.getParameter("location_id"));
	departmentDTO.setDEPARTMENT_ID(department_id);
	departmentDTO.setDEPARTMENT_NAME(department_name);
	departmentDTO.setMANAGER_ID(manager_id);
	departmentDTO.setLOCATION_ID(location_id);
	int result = 0;
	try {
		result = departmentDAO.update(departmentDTO);	
	} catch (Exception e){
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
		let result = <%=result%>
		if(result){
			alert("수정 성공")
		} else {
			alert("수정 실패")
		}
		location.href = "./detail.jsp?id=<%=department_id%>"
	</script>
</body>
</html>