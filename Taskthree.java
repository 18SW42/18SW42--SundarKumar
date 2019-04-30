import java.util.Scanner;
class Taskthree 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num= Integer.parseInt(input.nextLine());
		int x=0;
		for(int i =1 ; i <= num ; i++)
		{
			x = x+i;
		}
		System.out.println(" The Sum is : " + x);
	}

}
