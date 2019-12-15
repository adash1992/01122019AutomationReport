package conditionalstatements;

public class IfElseStatements {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		/*
		 * if(a>b) //relational operator >,<,>=,<=,==,=! {
		 * System.out.println("a is greater than b"); }else {
		 * System.out.println("a is less than a"); }
		 */
		
		//2 <
		if (a<b)
		{
			System.out.println("a is less than b");
		}else {
			System.out.println("a is greater than a");
		}
		
		//3 >=
		if (a >=b)
		{
			System.out.println("a is greater than equal to b");
		}
		else 
		{
			System.out.println("a is less than equal to a");

		}
		
		//4 <=
		if (a<=b)
		{
			System.out.println("a is less than equal to b");

		}
		else
		{
			System.out.println("a is greater equal to a");

		}
		
		//5 ==
		if (a==b)
		{
			System.out.println("a is  equal to b");
		}
		else 
		{
			System.out.println("a is not equal to b");
		}
	
	}

}
