import java.util.HashSet;
import java.util.Iterator;

public class LottoSetTest {

	public static void main(String[] args) {
			
		//1-45 난수
		HashSet<Integer> lotto = new HashSet<Integer>(6);
		
		while(lotto.size() != 6)
		{
			int ran = (int)(Math.random()*45)+1;
			lotto.add(ran);
			System.out.println(ran +":"+ lotto.size());
			
		}
		
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}