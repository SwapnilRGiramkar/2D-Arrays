//Searching element in 2D-Array
//Giving user input 
package simpleArrays;

import java.util.Scanner;

public class SearchElement2 
{
	public static void searchElement(int[][]arr,int search)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==search)
				{
					System.out.println(search+" Search Element found at Index ("+(i+1)+","+(j+1)+")");
					flag=true;
					return;
				}
			}
		}
		if(!flag)
		{
			System.out.println(search+" Element Not Found in 2D array");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the rows of an Array");
		int rows=sc.nextInt();
		
		System.out.println("Enter the columns of an Array");
		int cols=sc.nextInt();
		
		int[][]arr=new int[rows][cols];
		
		System.out.println("Enter the Array Elements ");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter the number you want to Search ");
		int search=sc.nextInt();
		searchElement(arr, search);
		sc.close();
	}
}

