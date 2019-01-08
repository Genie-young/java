package algo;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int cal[] = new int[input + 1];
		cal[1]=0;

		for (int i = 2; i <= input; i++) {
			int cnt = 0;
			int temp=100000;

			cnt = (1 + cal[i - 1]);
			if (i % 3 == 0) {
				temp = (1 + cal[i / 3]);
			} else if (i % 2 == 0) {
				temp = (1 + cal[i / 2]);
			}
			if(temp<cnt)
				cnt = temp;
			cal[i] = cnt; 
		}
		System.out.println(cal[input]);
	}
}
