package FAQ_Programs;

public class Fibonacci {

	public static void main(String[] args) {

		int n1=0,n2=1,sum=0;      //0 1  1 2 3 5 8 13 21 34
				
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<10; i++)
		{
			sum=n1+n2; // 5 8
			System.out.print(" "+sum); // 2 3 5 8 13
			
			n1=n2;  //5
			n2=sum;  //8
		
		}
		
		
		
		
		
		
		
		
		
	}

}
