package com.demo;

public class sum {

	public static void main(String[] args) {
		int sum=0;
		for(String i:args) {
			 int intValue = Integer.parseInt(i);
			 sum+=intValue;
		}
		int average=sum/args.length;
		System.out.println(sum);
		System.out.println(average);
		int count=0;
		for(String i:args)
		{
			if(Integer.parseInt(i)<average)
				count++;
		}
		System.out.println(count);

	}

}
