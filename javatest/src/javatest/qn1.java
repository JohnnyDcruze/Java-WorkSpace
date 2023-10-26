package javatest;
import java.util.*;
public class qn1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		int gross_salary=0;
		
		if(salary>=12000)
			gross_salary=(int) (salary+(salary*0.3)+(salary*0.8));
		
		else if(salary>=8001)
			gross_salary=(int) (salary+(salary*0.25)+(salary*0.7));
			
		else if(salary>=4001)
			gross_salary=(int) (salary+(salary*0.2)+(salary*0.6));
		
		else if(salary>=1)
			gross_salary=(int) (salary+(salary*0.1)+(salary*0.5));
		
		System.out.println(gross_salary);
	}

}
