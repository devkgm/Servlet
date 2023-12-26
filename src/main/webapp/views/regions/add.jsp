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
        <form action="./addProcess.jsp">
            <label>ID:</label>
            <input
                type="text"
                name="region_id"
                placeholder="아이디를 입력하세요."
            />
            <br />
            <label>이름:</label>
            <input
                type="text"
                name="region_name"
                placeholder="이름를 입력하세요."
            />
            <br />
            <button type="submit">추가하기</button>
        </form>
    </body>
</html>
