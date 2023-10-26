package firstProgram;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int output=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			output*=i;
		}
		System.out.println(output);

	}

}
