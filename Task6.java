import java.util.Scanner;
class Task6
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int []num={1,2,3,4,5};
		int x = Integer.parseInt(args[0]);
		boolean available=false;
		for (int n : num)
		{
			if(n==x)
			{
			  	available = true;
				break;
			}
		}
		if(available)
		System.out.println(x + "is found ");
		else
		System.out.println(x+ "is not found");
	}
}

