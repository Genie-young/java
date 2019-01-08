package chap3;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cntofBooks = 97; 
		int cntofStu = 12;
		
		if(cntofBooks < cntofStu)
			System.out.println("나눠줄 수 없습니다.");
		else
		{
			System.out.println("1명의 학생당 : "+cntofBooks/cntofStu+ "권씩 가질 수 있습니다.");
			System.out.println("남아있는 책은 "+cntofBooks%cntofStu+ "권 입니다.");
		}	
	}

}
