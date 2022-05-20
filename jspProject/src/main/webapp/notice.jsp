<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
<link href="./css/menu.css" rel="stylesheet">
<style type="text/css">
#main {
	margin: 0 auto;
	width: 800px;
	height: 100%;
}

#noticeWriteForm {
	margin: 0 auto;
	margin-top: 100px;
	padding: 10px;
	height: 500px;
	width: 500px;
	background-color: green;
}

#noticeWriteForm input {
	margin: 0;
	padding: 0;
	line-height: 30px;
	width: 100%;
	height: 30px;
	margin-bottom: 5px;
	box-sizing: border-box;
	padding: 5px;
}

#noticeWriteForm textarea {
	margin: 0;
	padding: 5px;
	width: 100%;
	height: 400px;
	margin-bottom: 5px;
	box-sizing: border-box;
}
</style>
</head>
<body>
<%@include file="./menu.jsp"%>
	<table>
			<tr>
				<th id="col1">번호</th>
				<th id="col3">제목</th>
				<th id="col1">쓴사람</th>
				<th id="col2">쓴날짜</th>
			</tr>
			<c:forEach items="${list }" var="i">
			<tr>
				<td>${i.n_no }</td>
				<td id="tleft"><a href="./noticeDetail?n_no=${i.n_no }">${i.n_title  }</a></td>
				<td>${i.m_no }</td>
				<td>${i.n_date }</td>
			</tr></c:forEach>
		</table>
</body>
</html>