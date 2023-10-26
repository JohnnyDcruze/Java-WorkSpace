package com.demo;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequedemo {

	public static void main(String[] args) {
		Deque<Integer> deq=new ArrayDeque<Integer>(3);
		deq.add(1);
		deq.add(2);
		deq.add(3);
		//deq.add(4);
		System.out.println(deq);

	}

}
