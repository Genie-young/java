package chap10;
class MySum {
    int first;
    int second;
    String msg;
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }
    @Override
	public String toString() {
    	msg = String.valueOf(first+second) ; 
		return msg;
	}
	public boolean equals(Object obj) {
		if(obj instanceof MySum)
		{
			//String msg1 = ;
			if(msg.equals(obj.toString()))
				return true;
		}
		return false; 
	}

}
public class OverridingTest {

	public static void main(String[] args) {
        int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(j, i);

        System.out.println(ms1);//30
	System.out.println(ms2);//30
	
        if(ms1.equals(ms2))
            System.out.println("ms1과 ms2의 합계는 동일합니다.");

	}

}
