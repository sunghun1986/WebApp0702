<%@page import="com.and.model.notice.Notice"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	Notice notice = (Notice)request.getAttribute("notice");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 등록 폼</title>
<style>
div {
	margin: auto;
}

div {
	width: 500px;
	height: 500px;
	border: 2px solid blue;
	text-align: center;
}

div input, textarea {
	width: 98%;
}

textarea {
	height: 350px;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function() {
		$("#bt_list").click(function() {
			//history.back();//이전페이지로
			//캐시를 보여주는 거라서, 누군가가 글을 썻을때 갱신된 내용을
			//볼수 없다..
			//새롭게 서버에게 요청을 시도하는것임.
			$(location).attr("href","/notice/list.do");
		});
		$("#bt_del").click(function(){
			if(confirm("삭제하시겠습니까?")){
				del();
			}
		});
		$("#bt_edit").click(function(){
			if(confirm("수정하시겠습니까?")){
				edit();
			}
		});
	});
	function del() {
		//alert("삭제요청시도");
		location.href="/notice/delete.do?notice_id=<%=notice.getNotice_id()%>";
	}
	function edit(){
		//수정을 담당하는 서블릿에게 요청!!
		$("form").attr("method","post");//양이 많아서!
		$("form").attr("action","/notice/edit.do");
		$("form").submit();
	}
</script>
</head>
<body bgcolor = "yellow">
	<div>
		<form>
			<input type="hidden" name="notice_id" value="<%=notice.getNotice_id()%>"/> 
			<input type="text" name="title" value="<%=notice.getTitle()%>"/> 
			<input type="text" name="writer" value="<%=notice.getWriter()%>"/>
			<textarea name="content"><%=notice.getContent()%></textarea>
		</form>
		<button id="bt_list">리스트</button>		
		<button id="bt_edit">수정</button>
		<button id="bt_del">삭제</button>
	</div>
</body>
</html>












