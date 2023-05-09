package FAQ_Programs;

public class ReverseNumber {

	public static void main(String[] args) {

		int num=1234,rev=0,rem;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse of number is :"+rev);
	
		
//*******************************************************************	//
		
	/*	int rev=0,rem;
		
		for(int num=12345; num>0; num--)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse of number is :"+rev);
	*/	
		
//************************************************************************* //		
		
		//***** PALLINDROME NUMBER ****//
		
    /*    int num=1234,rev=0,rem,  temp=num;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse of number is :"+rev);
		
		if(temp==rev)
		{
			System.out.println("number is pallindrome");
		}
		else
		{
			System.out.println("Number is not pallindrome");
		}
	*/		
	}

}
