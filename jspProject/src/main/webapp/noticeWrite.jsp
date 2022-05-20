<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="./menu.jsp"%>
	<div id="main">

		<div id="noticeWriteForm">
			<form action="./noticeWrite" method="post"
				enctype="multipart/form-data">
				<input type="text" name="title" required="required">
				<textarea name="content"></textarea>
				<input type="file" name="file" accept="image/*">
				<button type="submit">공지등록</button>
			</form>
		</div>
		
	</div>
</body>
</html>