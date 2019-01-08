package chap7;

class Employee {
	int id;
	String name;
	int salary;
	int sudang;
	int total;

	// 생성자
	public Employee(int id, String name, int salary, int sudang) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.sudang = sudang;
		wage(); 
	}

	// 급여계산
	void wage() {
		total = salary + sudang;
		System.out.println(id +" : "+name +" : "+salary +" : "+total);
	}
}
class Manager extends Employee {
	int ganbuSudang;

	Manager(int id, String name, int salary, int sudang, int ganbuSudang) {
		super(id, name, salary, sudang);
		
		this.ganbuSudang = ganbuSudang;
	}
	
	@Override
	void wage() {
		total = salary + sudang + ganbuSudang;
		System.out.println(id +" : "+name +" : "+salary +" : "+total);
	}

}

class Engineer extends Employee{
	int qualSudang, skillSudang;

	Engineer (int id,String name,int salary,int sudang,int qualSudang,int skillSudang){
		super(id,name,salary,sudang);
		this.qualSudang = qualSudang;
		this.skillSudang = skillSudang; 
	}
	//사번:이름:본봉:총급여
	@Override
	void wage() {
		total = salary + sudang + qualSudang + skillSudang;
		System.out.println(id +" : "+name +" : "+salary +" : "+total);
	}
}		
class Secretary extends Employee{
	int secreSudang;
	Secretary(int id,String name,int salary,int sudang,int secreSudang)
	{
		super(id,name,salary,sudang);
		this.secreSudang = secreSudang;
	}
	@Override
	void wage() {
		total = salary + sudang + secreSudang;
		System.out.println(id +" : "+name +" : "+salary +" : "+total);
	}
}
class SalaryTest{
public static void main(String args[]){

	Employee e [] = new Employee[4];
	// 1.상속 2.생성자(타입 순서 갯수....)
	e[0] = new Employee(1000,"이사원",10000,5000);
	e[1] = new Manager
	(2000,"김간부",20000,10000,10000);
	e[2] = new Engineer
	(3000,"박기술",15000,7500,5000,5000);
	e[3] = new Secretary
	(4000,"최비서",15000,7000,10000);
	/* 배열 내의 각 객체의 
          급여계산메소드 호출하고
	사번, 이름, 총급여 출력

사번:이름:본봉:총급여
1000:이사원:10000:xxxxx
2000:김간부:20000:xxxxx
3000:박기술:15000:xxxxx
4000:최비서:15000:xxxxx
 */ 
	}
}
