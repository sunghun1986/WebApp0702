<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	//수정후, 다시 상세보기 페이지를 보여줘야 하므로, 현재 jsp는
	//디자인 필요없음.
	request.setCharacterEncoding("utf-8");//인코딩 처리
	
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	int notice_id = Integer.parseInt(request.getParameter("notice_id"));
	
	out.print("title:"+title);
	out.print("writer:"+writer);
	out.print("content:"+content);
	out.print("notice_id:"+notice_id);
	
	String sql="update notice set title=?, writer=?, content=?";
	sql+=" where notice_id=?";
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection(url,user,pw);
	pstmt=con.prepareStatement(sql);
	pstmt.setString(1,title);
	pstmt.setString(2,writer);
	pstmt.setString(3,content);
	pstmt.setInt(4,notice_id);
	
	int result = pstmt.executeUpdate();
	
%>


<script>
<%if(result==1){%>
	alert("수정 완료");
	location.href="/notice/content.jsp?notice_id=<%=notice_id%>";
<%}else{%>
	alert("수정 실패");
	history.back;
<%}%>
</script>
<%	
	if(pstmt!=null){pstmt.close();}
	if(con!=null){con.close();}
%>
