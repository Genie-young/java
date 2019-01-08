package chap2;

public class StudentVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학번 이름 전화번호 이메일 성적 수강과목수 총이수학점
		// 상태재학중 /졸업
		String id, name, phone, email;
		id = "09111222";
		name = "이학생";
		phone = "010-2222-4444";
		email = "email@multi.com";
		double score = 4.5;
		int total = 145; 
		boolean state = true;
		
		System.out.println("학번 = "+id+" 이름 = "+name+" 폰번호 = "+phone+" 이메일 ="+email+" 성적 = "+score);
		int kor = 98;
		int eng= 99;
		int mat = 66;
		int sum = kor+eng+mat; 
		double avg = sum/3.0; 
		System.out.println(avg);
		
	}

}
