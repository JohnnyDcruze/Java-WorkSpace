package com.demo;

public class basics2 {

	public static void main(String[] args) {
		int sum=0;
		for(String input:args)
		{
			int value=Integer.parseInt(input);
			if(value==-999)
			{
				System.out.println(sum);
			}
			else
				sum+=value;
		}

	}

}
//package com.demo;
//import java.util.*;
//public class basics2 {
//
//	public static void main(String[] args) {
//		int sum=0;
//		boolean flag=true;
//		while(flag)
//		{
//			Scanner sc=new Scanner(System.in);
//			int value=sc.nextInt();
//			if(value!=-999)
//				sum+=value;
//			else
//				flag=false;	
//		}
//		System.out.println(sum);
//	}
//
//}
