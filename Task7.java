class Task7
{
	public static void main(String args[])
	{
		int arr[]={1,4,3,6,3,8,2,7,5,9,12,10};
		System.out.print("Before Sorting:");
		
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		
		for(int x=0;x<arr.length;x++)
		{
			for(int y=0;y<arr.length-1-x;y++)
			{
				if(arr[y]>arr[y+1])
				{
					int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
		System.out.print("\nAfter Sorting: ");
		for(int x=0;x<arr.length;x++)
			System.out.print(arr[x]+" ");
	}
}