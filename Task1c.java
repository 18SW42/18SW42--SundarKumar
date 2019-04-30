class Task1c
{
	public static void main(String args[])
	{
		int star=1;
		int h=5;
		int space=h-1;
		int x,y,z;
		for( x=0 ; x<h ; x++)
		{
			for( y=space ; y>x ; y--)
			{
				System.out.print(" ");
			}
			for(z=0 ; z<star ; z++)
			{
				System.out.print("*");
			}
			star+=2;
			System.out.println();
		}
	}
}