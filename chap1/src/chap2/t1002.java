package chap2;
import java.util.*;

public class t1002{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] x = new int[2];
		int[] y = new int[2];
		int[] r = new int[2];
		int add, sub; 
		int N = scan.nextInt();
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < 2; i++) {
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();
				r[i] = scan.nextInt();
			}
			int dx= x[0]-x[1];
			int dy= y[0]-y[1];
			int d = dx*dx + dy*dy;
			
			if (r[0] > r[1]) 
				sub = r[0]-r[1];
			else sub = r[1]-r[0];
			add = r[0]+r[1];
			
			sub = sub*sub;
			add = add*add;

			if (sub< d && d < add) // 두 점에서 만날 때
				System.out.println(2);
			else if ((d == sub && d != 0 )|| d ==add) // 외접 or 내접
				System.out.println(1);
			else if (d < sub || d > add)
				System.out.println(0);
			else if (d == 0)
                 if(r[0]==r[1])
				    System.out.println(-1);
                else System.out.println(0);
		}
	}

}
