<%@ page contentType="text/html; charset=UTF-8"%>
<%
	// 여기서는 파라미터만 받고, 결과 메시지는 별도의 result.jsp 에서 처리한다!
	request.setCharacterEncoding("utf-8");
	String nick = request.getParameter("nick");
	
	
	//result.jsp로 결과를 넘기기 위한 포워딩 처리!
	request.setAttribute("msg", nick);
	System.out.println("포워딩 하기전의 요청객체 "+request);
	
	RequestDispatcher dis = request.getRequestDispatcher("/test/result.jsp");
	dis.forward(request, response);
	
	
	//요청을 끊고 새롭게 요청을 시도하도록 처리!
	//즉 다시 접속을 유도하는 방법을 redirect
	//지정한 url로 다시 접속하게 하는 메서드!
	//즉 이 서블릿으로 부터 응답을 받은 클라이언트의 브라우저로 하여금
	//재 접속을 명령!!
	//response.sendRedirect("/test/result2.jsp?msg="+nick);
	
%>
