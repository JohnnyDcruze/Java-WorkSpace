package javatest;
import java.util.*;
public class qn3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number=sc.nextInt();
		int input=number;
		int reverse=0;
		while(number>0)
		{
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;
		}
		System.out.println(reverse);
		if(reverse==input)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		

	}

}
