package FAQ_Programs;

public class ReverseString {

	public static void main(String[] args) {


	/*	String actual ="Dinesh";
		String rev ="";
		
		for(int i=actual.length()-1; i>=0; i--)
		{
			rev=rev+actual.charAt(i);
		}
		System.out.println("Reverse of String is :"+rev);  */
		
//***************************************************************************************************************//	
		
	/*	String actual="tester";
		String rev="";
		
		for(int i=actual.length()-1; i>=0; i--)
		{
			rev=rev+actual.charAt(i);
		}
		System.out.println("Reverse of string is: "+rev);
	*/	
//****************************************************************************************************************//
		
/*		int num=12345,rev=0,rem;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse of number :"+rev);
*/
//******************************************************************************************************************//
		
		String act="Automation";
		String rev="";
		
		for(int i=act.length()-1; i>=0; i--)
		{
			rev=rev+act.charAt(i);
		}
		System.out.println("Reverse of string :"+rev);
		
	}

}
