package chap2;
import java.util.*;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//int a = scan.nextInt();
		//int b = scan.nextInt();
		int i = 100;
		double pi = 3.14;
		boolean b1 = true; 
		char c1 = 'a';
		System.out.println("b1="+b1);
		System.out.println("c1="+c1);
		c1 = '가';
		System.out.println("c1="+c1);
		c1 = '\n';
		System.out.println("c1="+c1);
		b1 = i>c1;
		System.out.println("b1="+b1);
		
		
		
		
	}

}
