<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%!
String url="jdbc:oracle:thin:@localhost:1521:XE";
String user="c##java";
String pw="1234";

Connection con;
PreparedStatement pstmt;
ResultSet rs;
%>
<%
	//삭제후 리스트를 클라이언트에게 보여줘야 하므로,
	//이 페이지는 디자인적 기능이 필요없다!! html 필요없음
	int notice_id = 0;
	notice_id = Integer.parseInt(request.getParameter("notice_id"));
	
	String sql="delete from notice where notice_id="+notice_id;
	out.print(sql);
	
	//삭제쿼리 수행
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection(url,user,pw);
	
	pstmt=con.prepareStatement(sql);
	int result = pstmt.executeUpdate();
	
%>
<script>
<%if(result==1){%>
	alert("삭제완료");
	location.href="/notice/list.jsp";
<%}else{%>
	alert("삭제실패");
	history.back;
<%}%>
</script>
<%
	if(rs!=null){rs.close();}
	if(pstmt!=null){pstmt.close();}
	if(con!=null){con.close();}
%>







