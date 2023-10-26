package com.demo;
import java.util.*;
public class range {
	public static void main(String []args)
	{
		int value=Integer.parseInt(args[0]);
		if(value<1&&value>50)
			System.out.println("Enter a valid input");
		int[] array=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int  i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			if(array[i]<1&&array[i]>50)
			{
				System.out.println("enter the valid number");
				array[i]=sc.nextInt();
			}
		}
		boolean output=false;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==value)
				output=true;
		}
		if(output)
			System.out.println("Bingo");
		
		
		
	}
	

}
