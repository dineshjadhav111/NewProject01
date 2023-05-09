package StarPatterns;

public class Diamond1 {

	public static void main(String[] args) {

		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=2; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++)
		{
			for(int m=1; m<=i; m++)
			{
				System.out.print(" ");
			}
			for(int n=3; n>=i; n--)
			{
				System.out.print("*");
			}
			for(int o=2; o>=i; o--)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
