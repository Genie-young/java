//package chap7;
//
//class Employee {
//	String title;
//	int id;
//	String name;
//	String dept;
//
//	public void printField() {
//		System.out.println(id + " : " + name + " : " + dept);
//	}
//
//}
//
//class Manager extends Employee {
//
//	String title = "관리";
//	String jobOfManage; 
//	int cntOfSubs;
//
//	void test() {
//		System.out.println();
//	}
//	@Override
//	public void printField() {
//		System.out.println(id + " : " + name + " : " + dept);
//		System.out.println(jobOfManage + " : " + cntOfSubs );
//	}
//}
//public class ManagerTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String title;
//		int id;
//		String name;
//		String dept;
//		Manager m = new Manager();
//		m.name = "park";
//		m.id = 10123;
//		m.dept = "what";
//		m.jobOfManage = "manage";
//		m.cntOfSubs = 10; 
//		m.printField();
//	}
//
//}
