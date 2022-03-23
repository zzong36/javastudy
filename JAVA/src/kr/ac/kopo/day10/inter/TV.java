package kr.ac.kopo.day10.inter;

public interface TV {
	
	int MIN_VOLUME_SIZE = 0;
	int MAX_VOLUME_SIZE = 50;	// public static final이 생략됨
	
	/**
	 * 전원을 켜는 기능
	 */
	
	void powerOn();				// public abstract가 생략되어 있음
	void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
	

}
