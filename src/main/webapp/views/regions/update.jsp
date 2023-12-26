<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Insert title here</title>
    </head>
    <body>
        <h1>Region Add</h1>
        <form action="./updateProcess.jsp">
        	<input name="region_id" type="hidden" value="<%= Integer.parseInt(request.getParameter("id")) %>" >
            <label>이름:</label>
            <input
                type="text"
                name="region_name"
                value="<%= request.getParameter("name") %>"
                placeholder="수정할 이름를 입력하세요."
            />
            <br />
            <button type="submit">수정하기</button>
        </form>
    </body>
</html>
