package chap4;

public class AlphaConversion {

	
	public static void main(String[] args) {

		int dis = (int)'a'-(int)'A'; 
		// TODO Auto-generated method stub
		while(true)
		{
			int num = (int)(Math.random()*200)+1;
			if(num<50 || num>150)
				break;
			else if(num>65 && num<90)
				System.out.println((char)num+"를"+ (char)(num+dis)+"로 변경합니다.");
			else if(num>97 && num<122)
				System.out.println((char)num+"를"+ (char)(num-dis)+"로 변경합니다.");
			else
				System.out.println((char)num);
		}
	}

}
