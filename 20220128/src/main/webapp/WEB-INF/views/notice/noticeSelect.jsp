<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<jsp:include page="../main/header.jsp" />
		<div><h1>공지사항 보기</h1></div>
		<div>
		<table border="1">
			<tr>
			<th width="100">작성자</th>
			<td width="150" align="center">${notice.noticeWriter }</td>
			<th width="100" >작성일자</th>
			<td width="150" align="center">${notice.noticeDate }</td>
			<th width="100">조회수</th>
			<td width="100" align="center">${notice.noticeHit }</td>
			</tr>
			<tr>
			<th>제목</th>
			<td colspan="5">${notice.noticeTitle }</td>
			</tr>
			<tr>
			<th>내용</th>
			<td colspan="5">
			<textarea rows="10" cols="100">${notice.noticeSubject }</textarea>
			</td>
			</tr>
		</table>
		</div><br>
		<div>
		<button type="button" onclick="location.href='noticeList.do'">목록</button>&nbsp;&nbsp;
		</div>
	</div>
</body>
</html>