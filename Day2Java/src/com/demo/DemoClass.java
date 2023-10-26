package com.demo;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=0;
		//int store=Integer.parseInt(args[0]);
		for(String i:args) {
			value=Integer.parseInt(i);
			//sum+=value;
		}
		for(int i=1;i<=value;i++)
		{
			if (i%2==0)
				System.out.println(i);
		}
		
		
	}

}
