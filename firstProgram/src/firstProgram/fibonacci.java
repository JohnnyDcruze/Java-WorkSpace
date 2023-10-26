package firstProgram;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		int n,prev1=0,prev2=1;
		System.out.println("Enter the number of terms : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int count=1;
		while(count<=n)
		{
			System.out.println(prev1);
			int temp=prev1;
			prev1=prev2;
			prev2=temp+prev2;
			count++;
				
		}

	}

}
