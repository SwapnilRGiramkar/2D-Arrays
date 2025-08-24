//In This Program we trnspose the 2-D Array
//example-->
package simpleArrays;

public class TransposeArray 
{
	public static void main(String[] args)
	{
		int [][]arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		int rows=arr.length;
		int cols=arr[0].length;
		 int[][] transpose = new int[cols][rows];
		 
		 System.out.println("Real Matrix");
		 for(int i=0;i<rows;i++)
			{
				for(int j=0;j< cols;j++)
				{
					 System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
			}
		 
		 
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j< cols;j++)
			{
				 transpose[j][i] = arr[i][j];
			}
			
		}
		
		 System.out.println("Transpose of matrix:");
		 
	        for (int i = 0; i < cols; i++) 
	        {
	            for (int j = 0; j < rows; j++) 
	            {
	                System.out.print(transpose[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}

