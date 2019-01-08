package chap18;

import java.util.Scanner;
import java.lang.*;

class BoardVO {
	int seq;
	String title;
	String contents;
	int viewcount;

	// 생성자
	public BoardVO(int seq, String title, String contents, int viewcount) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.viewcount = viewcount;
	}

	@Override // toString()오버라이드
	public String toString() {
		String str = "번호 = " + seq + " 제목 = " + title + " 내용 = " + contents + " 조회수 = " + viewcount;
		return str;
	}
}

class boardDAO {
	public void insertBoard(BoardVO vo) {
		System.out.println(vo + "======> 게시물 저장을 완료했습니다. ");
	}
}

public class BoardTest {

	public static void main(String[] args) {
		System.out.println("게시물 정보를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String message;
		message = sc.nextLine();

		String splitedStr[] = message.split(":");

		BoardVO vo = new BoardVO(Integer.parseInt(splitedStr[0]), splitedStr[1], splitedStr[2],
				Integer.parseInt(splitedStr[3]));
		boardDAO v1 = new boardDAO();
		v1.insertBoard(vo);
	}

}
