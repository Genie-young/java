package chap11;

class MyObject {
	String msg;

	MyObject(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(msg.equals(obj.toString()) && obj instanceof MyObject ) {
			return true;
		}
		return false;
	}
	
}

public class ObjectTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject("청년취업");
		MyObject o2 = new MyObject("청년취업");

		System.out.println(o1);
		System.out.println(o1.toString());
		System.out.println(o2);
		System.out.println(o2.toString());
		if (o1 == o2)
			System.out.println("same");
		if (o1.equals(o2))
			System.out.println("value same");

	}

}