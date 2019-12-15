package arrays;

public class arraysOne {

	public static void main(String[] args) 
	{
		String[] std = new String[11];
		System.out.println(std.length);
		
		
		std[0] = "Amrita";
		std[1] = "Neetishree";
		std[2] = "Durga";
		std[3] = "Prasad";
		std[4] = "kali";
		std[5] = "Amit";
		std[6] = "charan";
		std[7] = "Asmita";
		std[8] = "Akshay";
		std[9] = "Pragati";
		std[10] = "Dash";
		
	/*	System.out.println(std[2]);
		for (int i=0;i<= std.length-1;i++)
		{
			System.out.println(std[i]);
		}
		
		for (int i= std.length-1;i>=0;i--)
		{
			System.out.println(std[i]);
		} */
		
		//Enhanced for Loop
		//syntax : for(arrayDataType variable : array variable name)
		for(String s:std)
		{
			System.out.println(s);
		}
	}

}
