package com.demo;

import java.util.Arrays;

public class basics4 {

	public static void main(String[] args) {
		int input[]= {3,13,23,42,55,66,77,88,99,105};
		int count[]=new int[(input.length) +1];
		Arrays.fill(count, 0);
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>0&&input[i]<10)
				count[0]++;
			if(input[i]>10&&input[i]<20)
				count[1]++;
			if(input[i]>20&&input[i]<30)
				count[2]++;
			if(input[i]>30&&input[i]<40)
				count[3]++;
			if(input[i]>40&&input[i]<50)
				count[4]++;
			if(input[i]>50&&input[i]<60)
				count[5]++;
			if(input[i]>60&&input[i]<70)
				count[6]++;
			if(input[i]>70&&input[i]<80)
				count[7]++;
			if(input[i]>80&&input[i]<90)
				count[8]++;
			if(input[i]>90&&input[i]<100)
				count[9]++;
			if(input[i]>=100)
				count[10]++;		
		}
		int a=0,b=9;
		for(int i=0;i<count.length;i++)
		{
			if(i==10)
				System.out.println(count[10]);
			else {
			System.out.println("integer between "+a+" - "+b+"is "+count[i]);
			a+=10;
			b+=10;
			}
			
		}

	}

}
