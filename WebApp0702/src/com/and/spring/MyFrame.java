package com.and.spring;

import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//스윙의 부모인 제이컴포넌트 이용
	private JComponent t_title;
	private JComponent writer;
	private JComponent content;
	private JComponent scroll;
	private JComponent bt;
	
	
	
	public void setT_title(JComponent t_title) {
		this.t_title = t_title;
	}



	public void setWriter(JComponent writer) {
		this.writer = writer;
	}



	public void setContent(JComponent content) {
		this.content = content;
	}



	public void setScroll(JComponent scroll) {
		this.scroll = scroll;
	}



	public void setBt(JComponent bt) {
		this.bt = bt;
	}



	public void init() {
		//컴포넌트가 이미 존재한다는 가정하에 조립하자!!
		setLayout(new FlowLayout());
		add(t_title);
		add(writer);
		add(scroll);
		add(bt);
		
		
		setSize(400,450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}	
	
}















