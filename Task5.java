
class Task5
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,10,14,18,0};
		int largest;
		largest = arr[0];
		for ( int x=0 ; x < 9 ; x++)
		{
			if(largest < arr[x])
			{
				largest = arr[x];
			}
		}
		System.out.println("Largest Value : " + largest);
	}
}

