package FAQ_Programs;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String str = "dinesheedsh";
		String un="";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(un.indexOf(ch)==-1)
			{
				un=un+ch;
			}
			System.out.println(""+un);
		}
	}

}
