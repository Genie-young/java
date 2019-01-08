package chap4;
import java.util.*; 

public class star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int N = (int)(Math.random()*10)+1;
		System.out.println(N);
		for(int i=1;i<N+1;i++) 
		{
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
	
	}

}
