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
		<div>
			<h1>글 작 성</h1>
		</div>
		<div>
			<form id="frm" action="noticeWrite.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="100">작성자</th>
							<td width="150"><input type="text" id="noticeWriter"
								name="noticeWriter" value="${name }" readonly="readonly">
							</td>
							<th width="100">작성일자</th>
							<td width="150"><input type="date" id="noticeDate" name="noticeDate"></td>
							<script>
								document.getElementById('noticeDate').value = new Date().toISOString().substring(0, 10);
							</script>
						</tr>
						<tr>
							<th>제 목</th>
							<td colspan="3"><input type="text" size="59"
								id="noticeTitle" name="noticeTitle"></td>
						</tr>
						<tr>
							<th>내 용</th>
							<td colspan="3"><textarea rows="10" cols="59"
									id="noticeSubject" name="noticeSubject"></textarea></td>
						</tr>
					</table>
				</div><br>
				 <input type="submit" value="등록">&nbsp;&nbsp; 
				<input type="reset" value="취소">&nbsp;&nbsp; 
				<input type="button" value="목록" onclick="location.href='noticeList.do'">

			</form>
		</div>
	</div>
</body>
</html>