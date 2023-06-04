<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 목록</title>
</head>
<body>
	<h2>방명록 목록</h2>
	
	<table border = "1">
		<tr> <th>번호</th> <th>작성자</th> <th>이메일</th> <th>작성일</th> <th>제목</th> </tr>
		<c:forEach items="$(visitors)" var="v">
			<tr>
				<td>${v.aid}</td> <td>$(v.username)</td> <td>$(v.email)</td>
					<td>$(v.mdy)</td> <td>$(v.title)</td>
			</tr>
		</c:forEach>
	</table>
	
		<button type="submit">등록</button>
</body>
</html>