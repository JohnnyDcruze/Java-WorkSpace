package com.pune.pizzahut;

import java.util.Date;

public class Reception {

	public static void main(String[] args) {
		
		Order orderDetail=new Order(101, new Date(), 220, "Johnny", "chennai", 2);
		if(orderDetail.delivery())
		{
			System.out.println("Will deliver soon");
		}
		else
		{
			System.out.println("Home Delivery not available for this distance");
		}

	}

}
