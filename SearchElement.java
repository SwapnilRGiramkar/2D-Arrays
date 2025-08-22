//This Program Search the Element in 2D Array
package simpleArrays;
//Seaching the element in 2D array in hardcoding 
public class SearchElement 
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
					System.out.println(search+" Element Found at Position : ("+(i+1)+","+(j+1)+")");
					flag =true;
					return;
				}
			}
		}
		if(!flag)
		{
			System.out.println(search+" Searching Element Not Found");
		}
	}
	public static void main(String[] args) 
	{
		int [][]arr= {
				{1,2,3},
				{4,5,6},
				{6,7,8},
				};
		searchElement(arr, 4);
		
	}

}

