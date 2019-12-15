package arrays;

public class arraysTwo {

	public static void main(String[] args) 
	{
		/*	int[] i = new int[10];
		
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 60;
		i[6] = 70;
		i[7] = 80;
		i[8] = 90;
		i[9] = 100; */

		int[] i= {10,20,30,40,50,60,70,80,90,100};
		
		boolean flag=false;
		for(int x:i)
		{
			if(x==40) 
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("40 is present");
		}else
		{
			System.out.println("40 is not present");
		}
		
	}

}
