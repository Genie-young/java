package generic;

import java.util.ArrayList;

class Emp {
	int id;
	String name;
	double pay; // 급여
	public Emp(int id, String name, double pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	public String toString()
	{
		return id+"-"+name+"-"+pay;
	}
}

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<Emp> list  = new ArrayList<Emp>();
		
		Emp e1 = new Emp(100,"홍길동",67000.99);
		Emp e2 = new Emp(200,"박길동",77000.99);
		Emp e3 = new Emp(300,"김길동",87000.99);
		list.add(e1);
		list.add(e2);
		list.add(e3); 
		
		list.remove(1);
		boolean exists = list.contains("java");
		System.out.println(exists);
		System.out.println(list.size());
		
		int index = list.indexOf("java");
		System.out.println(index);
		
		boolean exists2 = list.contains(new Emp(100,"홍길동",6700.99));
		
		for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i).name);
		}
		
		
	}
}
