<%@page import="com.devkim.app.regions.RegionDTO"%>
<%@page import="com.devkim.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	RegionDAO regionDAO = new RegionDAO();
    	RegionDTO regionDTO = new RegionDTO();
    	int id = Integer.parseInt(request.getParameter("id")); 
    	regionDTO.setREGION_ID(id);
    	regionDTO = regionDAO.getDetail(regionDTO);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Region Detail</title>
</head>
<body>
	<h1>Region Detail</h1>
	<%= regionDTO.getREGION_ID() %>
	<%= regionDTO.getREGION_NAME() %>
</body>
</html>