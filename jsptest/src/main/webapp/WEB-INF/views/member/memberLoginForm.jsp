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
		<div>
			<h1>로 그 인</h1>
		</div>
		<div>
			<form id="frm" action="memberLogin.do" method="post">
				<table border="1">
					<tr>
						<th width="100">아 이 디</th>
						<td width="150"><input type="text" id="id" name="id"></td>
					</tr>
					<tr>
						<th width="100">패스워드</th>
						<td width="150"><input type="password" id="password" name="password"></td>
					</tr>

				</table>
				</div><br>
				<div>
				<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취 소">
				</div>
			</form>
		</div>

	</div>
</body>
</html>