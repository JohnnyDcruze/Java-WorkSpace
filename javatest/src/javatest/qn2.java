package javatest;
import java.util.*;

public class qn2 {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int input[]=new int[n];
		System.out.println("Enter the Array Values : ");
		for(int i=0;i<n;i++)
			input[i]=sc.nextInt();
		
		///duplicates removal
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(input[i]==-1)
					break;
				if(input[i]==input[j])
					input[j]=-1;
				
			}
		}
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>=-1)
				System.out.println(input[i]);
		}

	}

}
