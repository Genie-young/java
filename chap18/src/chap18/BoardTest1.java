package chap18;

class BoardVO {
	int seq;//번호
	String title;//제목
	String contents;//내용
	int viewcount;//조회수
	//생성자
	//getter/setter
	//toString
	//equals
}

class BoardDAO {
	public void insertBoard(BoardVO vo) {
		// 번호=1 제목=게시물저장 
		//내용=1개의 게시물을 저장합니다 조회수=0
		//===> 게시물 저장을 완료했습니다. 
		System.out.println
		(vo + "===> 게시물 저장을 완료했습니다.");
	}
}

public class BoardTest {
public static void main(String[] args) {
	System.out.println("게시물 정보를 입력하세요");
	//Scanner 생성
	// 한줄 내용 입력
	// 1:게시물저장:1개의 게시물을 저장합니다:0
	// BoardVO 객체로 생성
	//BoardDAO 객체 생성
	// insertBoard 메소드 호출 (BoardVO 객체)


}
}





