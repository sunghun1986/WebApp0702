package com.and.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.and.controller.Controller;
import com.and.model.notice.NoticeDAO;
/*
  1단계 : 요청을 받는다 (상위)
  2단계 : 요청을 분석 (상위)
  3단계 : 알맞는 로직 객체에 일시킨다 (하위 컨트롤러)
  4단계 : 결과가 있다면, 결과 저장(포워딩) (하위 컨트롤러)
  5단계 : 뷰를 보여준다 (상위컨트롤러)
 */
public class ListController implements Controller{
	NoticeDAO noticeDAO = new NoticeDAO();;
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//3단계 일시키기
		List noticeList = noticeDAO.selectAll();
		//4단계 : jsp 페이지로 가져가야 하므로 결과저장
		request.setAttribute("list", noticeList);
	}

	@Override
	public boolean isForward() {

		return true;
	}

	@Override
	public String getViewPage() {

		return "/notice/view/list";
	}

}
