package firstProgram;

import java.util.*;

public class sumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of values : ");
		n=sc.nextInt();
		int output=0;
		for(int i=1;i<=n;i++)
		{
			output+=Math.pow(i, 2);
		}
		System.out.println(output);
		
	}

}
