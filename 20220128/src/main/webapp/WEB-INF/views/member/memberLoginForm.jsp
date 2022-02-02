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
		 <div><br><h1>로   그   인</h1></div>
		<div>
			<form id="frm" action="login.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="150">아이디</th>
							<td><input type="text" id="id" name="id" required="required"></td>
						</tr>
						<tr>
							<th width="150">비밀번호</th>
							<td><input type="password" id="password" name="password" required="required">
							<td>
						</tr>
					</table>
				</div><br>
				<div>
				<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
				</div>
			</form>
		</div>
	</div>

</body>
</html>