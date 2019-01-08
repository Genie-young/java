package generic;

class Box<T> {
	T contents;

	public Box(T contents) {
		this.contents = contents;
	}

	public void setContents(T c) {
		contents = c;
	}

	public T getContents() {
		return contents;
	}

}

class Paper {
	String size;

	Paper(String size) {
		this.size = size;
	}
}

class Apple {
	String origin; // 원산지

	Apple(String origin) {
		this.origin = origin;
	}

}

public class GenericTest {

	public static void main(String[] args) {
		Paper p = new Paper("A4");
		Apple a = new Apple("청송");

		Box<Paper> paperBox = new Box<Paper>(p);
		Box<Apple> appleBox = new Box<Apple>(a);

		Paper o1 = paperBox.getContents();
		System.out.println(o1.size);
		Apple o2 = appleBox.getContents();
		System.out.println(o2.origin);
	}
}
