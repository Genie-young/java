package chap18;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		System.out.println("입력 시작하세요 ");
		Scanner key = new Scanner(System.in);
		String word = key.next();
		int num1 = key.nextInt();
		double num2 = key.nextDouble();

	}

}
