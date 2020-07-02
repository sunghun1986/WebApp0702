package com.and.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.and.controller.Controller;
import com.and.model.notice.NoticeDAO;

public class DeleteController implements Controller{

	NoticeDAO noticeDAO = new NoticeDAO();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//3단계 : 일시키자	
		String notice_id = request.getParameter("notice_id");
		noticeDAO.delete(Integer.parseInt(notice_id));
		//4단계 : X 해당없다.
	}

	@Override
	public boolean isForward() {	
		return false;
	}

	@Override
	public String getViewPage() {
	
		return "/notice/view/delete";
	}

}
