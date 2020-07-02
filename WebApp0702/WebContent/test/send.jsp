<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function send(){
		form1.action="/test/receive.jsp";
		form1.submit();
	}
</script>
</head>
<body>
	<form name="form1">
		<input type="text" name="nick" placeholder="별명입력" />
	</form>
		<button onclick="send()">전송</button>
</body>
</html>