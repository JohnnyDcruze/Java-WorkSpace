package com.demo;

public class basics3 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		String name=args[1];
		System.out.print(name);
		char array[]=String.valueOf(num).toCharArray();
		if(num<0)
			  System.out.println("Invalid");
		  else {
		for(int i=0;i<array.length;i++)
		{
			
			switch(array[i])
			{
			case '0':System.out.print("zero ");break;
			case '1':System.out.print("one ");break;
			case '2':System.out.print("two ");break;
			case '3':System.out.print("three ");break;
			case '4':System.out.print("four ");break;
			case '5':System.out.print("five ");break;
			case '6':System.out.print("six ");break;
			case '7':System.out.print("seven ");break;
			case '8':System.out.print("eight ");break;
			case '9':System.out.print("nine ");break;
			}
		}
		  }

	}

}
