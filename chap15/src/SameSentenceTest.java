import java.util.*;

class SameSentence {

	// Arraylist 개수가 같지 않으면 작은 쪽에 맞춰서 비교
	// 같으면 모두 비교
	String[] compare(List<String> list1, List<String> list2) {

		int size = list1.size();
		if (size != list2.size())
			if (list2.size() < size)
				size = list2.size();
		
		String[] result = new String[size];
		int index = 0;
		
		for (int i = 0; i < size; i++)
			if (list1.get(i).equals(list2.get(i))) {
				result[index] = list1.get(i);
				index++;
			}
		return result;
	}
}


public class SameSentenceTest {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("자바는 객체지향 언어입니다");
		list1.add("우리는 키트리에서 자바를 배우는 중입니다");
		list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		list1.add("내일은 입출력과 네트워크를 배울 예정입니다 ");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("자바는 객체지향 언어입니다");
		list2.add("우리는 kitri에서 자바를 배우는 중입니다");
		list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
		list2.add("내일은 입출력과 네트워크를 배울 예정입니다 ");

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("자바는 객체지향 언어입니다");
		list3.add("우리는 kitri에서 자바를 배우는 중입니다");
		list3.add("오늘은 콜렉션 프레임워크를 배우죠! ");

		SameSentence ss = new SameSentence();
		String[] result1 = ss.compare(list1, list2);// list1, list2에서 같은 내용 출력
		// ss.compare(list1, list3);//list3의 갯수만큼만 같은 내용 출력
		String[] result2 = ss.compare(list1, list3);
		int i = 0;
		while (result1[i] != null) {
			System.out.println(result1[i]);
			i++;
		}
		i = 0;
		while (result2[i] != null) {
			System.out.println(result2[i]);
			i++;
		}
		HashSet set = new HashSet();
		
	}
}