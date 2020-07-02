package com.and.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.and.controller.Controller;
import com.and.model.notice.Notice;
import com.and.model.notice.NoticeDAO;

public class RegistController implements Controller{

	NoticeDAO noticeDAO = new NoticeDAO();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		Notice notice = new Notice();
		
		notice.setTitle(request.getParameter("title"));
		notice.setWriter(request.getParameter("writer"));
		notice.setContent(request.getParameter("content"));
		
		noticeDAO.insert(notice);	//3단계 : 일 시킨다!!
		//4단계 : 일 시킨후 클라이언트에게 보여줄게 있을때, 즉 결과 jsp로 가져갈것이
		//있을때 request 객체에 결과 저장!! 따라서 없다!!
	}

	@Override
	public boolean isForward() {		
		return false;//클라이언트의 브라우저가 새롭게 재접속을 시도!!
	}

	@Override
	public String getViewPage() {		
		return "/view/notice/regist";
	}

}
