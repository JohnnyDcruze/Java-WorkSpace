package firstProgram;

import java.util.Arrays;

public class arrayall {

	public static void main(String[] arr) {
		int sum=0;
		for(String i:arr)
		{
			sum+=Integer.parseInt(i);
		}
		//float avg=sum/arr.length;
		//Arrays.sort(arr);
		//System.out.println("smallest"+arr[0]);
		//System.out.println("largest"+(arr.length-1));
		System.out.println("sum of all values is  "+ sum);
		//System.out.println("Average"+avg);
		System.out.println("Second Largest "+(arr.length-2));
		

	}

}
