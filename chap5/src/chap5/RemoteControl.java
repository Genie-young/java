package chap5;

public interface RemoteControl {
	int maxVolume = 10; // 상수
	int minVolume =0; 
	void turnOn(); // 추상메소드
	void turnOff();
	void setVolume(int Volume);
	default void setMute(boolean mute) // 디폴트메소드
	{
		if (mute)
			System.out.println("무음");
		else
			System.out.println("벨소리");
	}

	static void changeBattery()  // 정적메소드 
	{
		System.out.println("건전지 교환");
	}
}
