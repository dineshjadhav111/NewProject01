package if_else_if_1;

public class Example_No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Marks=80;
		
		if(Marks>=40 && Marks<=50)
		{
			System.out.println("Pass class");
		}
		else if(Marks>=50 && Marks<55)
		{
			System.out.println("second class");
		}
		else if(Marks>=55 && Marks<60)
		{
			System.out.println("Higher second class");
		}
		else if(Marks>=60 && Marks<=70)
		{
			System.out.println("First class ");
		}
		else if(Marks>=70 && Marks<=100)
		{
			System.out.println("First class with Distinction");
		}
		else
		{
			System.out.println("Result Not Found");
		}
	}

}
