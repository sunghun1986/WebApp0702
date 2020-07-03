package com.and.spring;

//공통코드 : 횡단적 관심사항 Aspect
public class Bell implements SoundObject{
	
	public void sound() {
		System.out.println("딩♬동♬댕♬");
	}
	
}
