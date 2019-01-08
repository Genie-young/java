package chap4;

public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum; 
		for(int i =1;i<10;i++)
			for(int j=2;j<10;j++)
			{
				if(i==5)break; 
				System.out.println( i +" " +j+" "+i*j );
			}
	}

}
