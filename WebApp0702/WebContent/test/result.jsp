<%@ page contentType="text/html; charset=UTF-8"%>
<%
	//이전의 서블릿이 심어놓은 데이터 끄집어 내기!!
	String nick = (String)request.getAttribute("msg");
	System.out.println("포워딩 하기전의 요청객체 "+request);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
</script>
</head>
<body>
	<%="전송된 닉네임은"+nick %>
</body>
</html>