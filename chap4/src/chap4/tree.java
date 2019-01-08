package chap4;

public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = (int)(Math.random()*10)+1; 
		for(int i=1;i<N;i++)
		{
			for(int j=1;j<N-i;j++)
			{
				System.out.print(" ");
			}
			for(int z=0;z<(i*2)-1;z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
