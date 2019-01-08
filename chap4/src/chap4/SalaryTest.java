package chap4;
import java.util.*; 

public class SalaryTest {

	Scanner sc=  new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "사원";
		int baseSalary = 30000;
		int totalSalary = 0;

		switch (title) {
		case "사원":
			totalSalary = baseSalary + 5000;
			break;
		case "대리":
			totalSalary = (int) (baseSalary * 1.2);
			break;
		case "과장 ":
			totalSalary = (int) (baseSalary * 1.5);
			break;
		default: 
			totalSalary = baseSalary * 2;

		}
		System.out.println(title+" 직급 급여는 "+totalSalary+"입니다.");

	}

}
