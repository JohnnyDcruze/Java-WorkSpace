package com.demo;

public class operations {

	public static void main(String[] args) {
		for(String s:args) System.out.println(s);
		int value1=Integer.parseInt(args[0]);
		int value2=Integer.parseInt(args[2]);
		int output=0;
		char operator=args[1].charAt(0);
		
		switch(operator) {
		case '+' :
			output=value1+value2;break;
		case '-' :
			output=Math.abs(value1-value2);break;
		case 'x' :
			output=value1*value2;break;
		case '/' :
			output=value1/value2;
			
			
		
		}
		System.out.println(value1 + " " + operator + " " +value2);
		System.out.println(output);

	}
}
