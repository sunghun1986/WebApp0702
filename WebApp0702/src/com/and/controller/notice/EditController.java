package com.and.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.and.controller.Controller;
import com.and.model.notice.Notice;
import com.and.model.notice.NoticeDAO;

public class EditController implements Controller{

	NoticeDAO noticeDAO = new NoticeDAO();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//3단계 : 일시키자
		Notice notice = new Notice();
		notice.setNotice_id(Integer.parseInt(request.getParameter("notice_id")));
		notice.setTitle(request.getParameter("title"));
		notice.setWriter(request.getParameter("writer"));
		notice.setContent(request.getParameter("content"));
		
		noticeDAO.update(notice);
		Notice obj = noticeDAO.select(notice.getNotice_id());
		//4단계: 수정결과를 jsp에서 보여줘야 하기 때문에
		//가져갈것이 있다
		request.setAttribute("notice", obj);
	}

	@Override
	public boolean isForward() {
	
		return true;
	}

	@Override
	public String getViewPage() {
	
		return "/notice/view/edit";
	}

}
