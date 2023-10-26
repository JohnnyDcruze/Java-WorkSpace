package com.demo;

import java.util.Scanner;

public class Michelan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count in the Menu List : ");
		int count=sc.nextInt();
		sc.nextLine();
		
		Menu []Menu_List=new Menu[count];
		
		for(int i=0;i<(Menu_List.length);i++)
		{
			System.out.println("Enter the name of the dish : ");
			String dishName=sc.nextLine();
			
			System.out.println("Enter the amount of Calories : ");
			float amtOfCalories=sc.nextFloat();
			
			System.out.println("Enter the cooking Time : ");
			int cookingTime=sc.nextInt();
			
			System.out.println("Enter the Price Per Person : ");
			float price=sc.nextFloat();
			
			System.out.println("No of Wine Bottles : ");
			float noOfWineBottles=sc.nextFloat();
			
			sc.nextLine();
			
			Menu menu=new Menu(dishName,amtOfCalories,cookingTime,price,noOfWineBottles);
			
			Menu_List[i]=menu;	
			System.out.println(menu.menuCount()+"Menu Added");
		}
		float totalPrice=0;
		for(int i=0;i<Menu_List.length;i++)
		{
			totalPrice+=Menu_List[i].Price_per_person;
			if(Menu_List[i].cooking_time<30)
				System.out.println(Menu_List[i].toString());
		}
		System.out.println("The total price is : "+totalPrice);
		if(totalPrice>65)
		{
			totalPrice=totalPrice-(totalPrice/10);
			System.out.println("The discounted price is : "+totalPrice);
		}

	}

}

class Menu{
	String name;
	float amt_of_calories;
	int cooking_time;
	float Price_per_person;
	float No_of_WineBottles;
	private static int menuCount;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getAmt_of_calories() {
		return amt_of_calories;
	}


	public void setAmt_of_calories(float amt_of_calories) {
		this.amt_of_calories = amt_of_calories;
	}


	public int getCooking_time() {
		return cooking_time;
	}


	public void setCooking_time(int cooking_time) {
		this.cooking_time = cooking_time;
	}


	public float getPrice_per_person() {
		return Price_per_person;
	}


	public void setPrice_per_person(float price_per_person) {
		Price_per_person = price_per_person;
	}


	public float getNo_of_WineBottles() {
		return No_of_WineBottles;
	}


	public void setNo_of_WineBottles(float no_of_WineBottles) {
		No_of_WineBottles = no_of_WineBottles;
	}


	public Menu(String name, float amt_of_calories, int cooking_time, float price_per_person, float no_of_WineBottles) {
		super();
		this.name = name;
		this.amt_of_calories = amt_of_calories;
		this.cooking_time = cooking_time;
		Price_per_person = price_per_person;
		No_of_WineBottles = no_of_WineBottles;
	}
	
//	public String toString()
//	{
//		return "Menu " +name+" contains "+amt_of_calories+" ,comes with "+No_of_WineBottles+" and cost "+Price_per_person;
//		
//	}
	
	public static int menuCount()
	{
		return ++menuCount;
		
	}
	public String toString()
	{
		return name+" cooks in "+cooking_time;
	}
	
	
}