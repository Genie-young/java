package chap5;

public class sortTest {

	public static void main(String[] args) {

		int N = 5;
		int ar[] = new int[N];

		for (int i = 0; i < N; i++) {
			//String str = args[i];
			ar[i] = Integer.parseInt(args[i]);
		}
		for (int i = 0; i < N; i++)
			System.out.print(ar[i]+ " ");
		System.out.println();
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++)
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

		for (int i = 0; i < N; i++)
			System.out.print(ar[i] + " ");
	}

}
