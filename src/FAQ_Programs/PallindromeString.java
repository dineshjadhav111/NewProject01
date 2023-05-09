package FAQ_Programs;

public class PallindromeString {

	public static void main(String[] args) {

		String actual="mom";
		String reverse="";
		
		for(int i=actual.length()-1; i>=0; i--)
		{
			reverse=reverse+actual.charAt(i);
		}
		System.out.println("Actual string :"+actual);
		System.out.println("Reverse string :"+reverse);
		 if(actual.equals(reverse))
		 {
			 System.out.println("String is pallindrome");
		 }
	}

}
