package chap3;
import java.util.*;
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		int key,point =-1;
		
		for(int i =0;i<N;i++)
		{
			String str = scan.next();
			if(str.equals("push"))
			{
				key = scan.nextInt();
				point ++; 
				arr[point] = key; 
			}
			else if(str.equals("pop"))  // 
			{
				if(point == -1)
					System.out.println("-1");
				else
				{
					System.out.println(arr[point]);
					point--;
				}
			}
			else if(str.equals("size")) // 정수 개수 출력 
			{	
				System.out.println(point+1);
			}
			else if(str.equals("empty")) // 비어있으면 1 아니면 0
			{
				if(point == -1)
					System.out.println("1");
				else
					System.out.println("0");
			}
			else if(str.equals("top"))
			{
				if(point == -1)
					System.out.println("-1");
				else
					System.out.println(arr[point]);
			}
		}
	}

}
