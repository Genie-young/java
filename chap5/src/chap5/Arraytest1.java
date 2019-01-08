package chap5;

public class Arraytest1 {

	public static void main(String[] args) {
		int []arr= new int[5]; 
		String str[] = new String[5];
		for(int i=0;i<5;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
			System.out.println("arr[i] = "+arr[i]);
		}
		for(int i=0;i<5;i++)
		{
			int j;
			for(j=2;j<arr[i];j++)
			{
				if(arr[i]%j ==0) {
					str[i] = "not prime";
					break;
				}
			}
			if(j==arr[i])
				str[i] = "prime";
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]+" => "+str[i]);
		}
		
	}

}
