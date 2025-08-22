//This is the simple program to display the 2D Array
package simpleArrays;
import java.util.Scanner;
public class Array2D 
{
	public static void array(int[][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the rows of the matrix");
		int rows=sc.nextInt();
		
		System.out.println("Enter the columns of the matrix");
		int cols=sc.nextInt();
		
		int[][]arr=new int[rows][cols];
		System.out.println("Enter the Elements of an 2DArray");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Print teh array");
		array(arr);
		sc.close();
	}

}

