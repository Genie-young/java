package chap4;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int su = (int) (Math.random() * 100) + 1;
		int i;
		for (i = 2; i < su; i++)
			if (su % i == 0) {
				System.out.println(su + "는 소수가 아닙니다.");
				return;
			}
		System.out.println(su + "는 소수입니다.");
	}
}
