package conditionalstatements;

public class NestedIfStatement {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		int c= 40;
		
		
		if (a>b)
		{
			if(b>c)
			{
				System.out.println("a is gretest");
			} else if (a>c)
			{
				System.out.println("a is greatest");
			} else
			{
				System.out.println("c is greatest");
			}
		} else if(b>c)
		{
			System.out.println("b is gretest");
		}else 
		{
			System.out.println("c is greatest");
		}
	}

}
