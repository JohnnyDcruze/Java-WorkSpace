/**
 * 
 */
package firstProgram;
import java.util.*;
public class matrixadd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numberr of rows : ");
		int n=sc.nextInt();
		System.out.println("Enter the numberr of coloumn: ");
		int m=sc.nextInt();
		
		int arr1[][]=new int[n][m];
		int arr2[][]=new int[n][m];
		int arr3[][]=new int[n][m];
		int sum=0;
		System.out.println("Enter the 1st array elements : ");
	
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				arr1[i][j]=sc.nextInt();		
			}
		}
		System.out.println("Enter the 2nd array elements : ");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				arr2[i][j]=sc.nextInt();		
			}
		}
		System.out.println("sum of both arrays : ");
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
				arr3[i][j]=	arr1[i][j]+arr2[i][j];	
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
