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
			<h1>공지 상세 보기</h1>
		   	 n_no : ${dto.n_no }<br>
			 n_title : ${dto.n_title }<br>
			 n_content : ${dto.n_content }<br>
			 n_date : ${dto.n_date }<br>
			 n_orifilename : ${dto.n_orifilename }<br>
			 n_filename : ${dto.n_filename }<br>
			 m_no : ${dto.m_no }<br>
			<hr>
			<img alt="업로드된 파일" src="./upload/${dto.n_filename }">
		
		
		<button onclick="location.href='./board'">게시판으로</button>
		</div>

</body>
</html>