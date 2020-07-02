package com.and.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//모든 하위 컨트롤러의 최상위 객체를 정의한다!!
//모든 하위 컨트롤러가 반드시 구현해야할 메서드를 정의 하고,
//모든 하위 컨트롤러의 자료형을 하나로 통일할 수 있다
//예전에 만들었던 GameObject 목적과 동일

public interface Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response);
	public boolean isForward();
	public String getViewPage();
}
