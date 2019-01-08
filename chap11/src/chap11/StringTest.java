package chap11;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class StringTest {
	  public static void main(String[] args) {
		String first = "Arnold";
		String middle = "Alois";
		String last = "Schwarzenegger";
		String initials;
		String firstInit, middleInit, lastInit;

		firstInit = first.valueOf(first.charAt(0));
		middleInit = middle.valueOf(middle.charAt(0));
		lastInit = last.valueOf(last.charAt(0));
		initials = firstInit + middleInit + lastInit;

		System.out.print("1. 이름: ");
		System.out.println(first + " " + middle + " " + last);
		System.out.print("2. 이름 (대문자): ");
		System.out.println(first.toUpperCase() + " " + last.toUpperCase());
		System.out.print("3. 이니셜:  ");
		System.out.println(initials);
				
		System.out.println("4. First Name은 arnold이다. (대소문자 구분; T/F):  " + first.equals("arnold"));
		System.out.println("5. First Name은 arnold이다. (대소문자 미구분; T/F):  " + first.equalsIgnoreCase("arnold"));
			
		System.out.println("6. Last Name " + last + "의 index 번호 6~14까지 문자열 : " + last.substring(6,14) );
		System.out.println("7. Last Name " + last + "에서 negger 문자열의 위치 : " + last.indexOf("negger"));		
		
		String s1 = "  test   ";
		System.out.println("--" +s1 + "--");
		
		Calendar cal = Calendar.getInstance(); 
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("현재 시각은 "+ year + "년도 "+ month+ "월 "+day + "일 "+ hour+ "시 "+minute+ "분 " +second + "초 ");
		
		cal.set(Calendar.DAY_OF_YEAR, cal.get(Calendar.DAY_OF_YEAR)+100);	
		month = cal.get(Calendar.MONTH)+1;
		System.out.println("현재 시각은 "+ year + "년도 "+ month+ "월 "+day + "일 "+ hour+ "시 "+minute+ "분 " +second + "초 ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyy / MM / dd / HH:mm:ss");
		//년 : y , 월 : M, 일: d(D), 시 : h(H)
		// ()안에 들은 것 or 대문자는 일년 중의 몇 번째 
		String datestr = sdf.format(cal.getTime());
		System.out.println(datestr);
		}
	  
	}