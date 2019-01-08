package chap5;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = null;
		int i;
		rc = new Television();
		rc = new RemoteControl(){
			public void turnOn() {System.out.println("On");}
			public void turnOff() {System.out.println("Off");}
			public void setVolume(int i) {System.out.println("set");}
		};
	}

}
