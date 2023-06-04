<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 수정</title>
</head>
<body>
<h2>방명록 수정</h2>
	<hr>
	<form method="post" action="/jwbook/VisitorsControl?action=insert">
		<labeㅣ>작성자</labe>
		<input type="text" name="username"><br>
		<label>이메일</label>
		<input type="text" name="email"><br>
		<label>제목</label>
		<input type="text" name="title"><br>
		<label>작성일</label>
		<input type="text" name="mdy"><br>
		<button type="submit">수정</button>
		<button type="submit">삭제</button>
		<button type="submit">목록</button>
	</form>
</body>
</html>