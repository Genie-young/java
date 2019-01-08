import java.util.HashMap;

public class PhoneMapTest {

	public static void main(String[] args) {
		String[] p1 = {"010-2222-3333", "010-4444-5555", "010-5555-6666", "kim@multi.com"};
		String[] p2 = {"010-6666-7777", "010-4444-5555", "010-7777-8888", "kimES@multi.com"};
		String[] p3 = {"010-8888-9999", "010-9999-0000", "010-1111-2222", "kimSSSSS@multi.com"};
		HashMap map = new HashMap(); 
		map.put("김태리", p1);  // 김태리의 전화번호부 목록을 저장 
		map.put("송혜교", p2);
		map.put("전지현", p3);
		

	}

}
