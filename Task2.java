import java.util.Scanner;
class Task2
{
	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Table");
		int x;
		x=input.nextInt();
		System.out.println("Enter a Starting Point");
		int y;
		y=input.nextInt();
		System.out.println("Enter a Ending Point");
		int z;
		z=input.nextInt();

		for(int a=y ; a<=z ; a++)
		{

			System.out.println(x + " * " + a +" = "+x*a);
			System.out.println();
		}
	}
}