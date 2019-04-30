public class Taskfour
{

	public static void main(String[] args)
	{
		 int a = 2, b = 2;   //a for rows and b for columns
		 
	        int[][] Matrixone = { {1, 2}, {4, 5} };
	        int[][] Matrixtwo = { {7, 8}, {10, 11} };

	        int[][] sum = new int[a][b];
	        for(int x = 0; x < a; x++)  //Addition of two matrices
	        {
	            for (int y = 0; y < b; y++)
	            {
	                sum[x][y] = Matrixone[x][y] + Matrixtwo[x][y];
	            }
	        }
	        System.out.println("Sum of two matrices in third matrix : ");
	        for(int[] row : sum)
	        {
	            for (int column : row)
	            {
	                System.out.print(column + "    ");//Result
	            }
	            System.out.println();
	        }
	}
}
