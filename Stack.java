package com.bridgelabz.day14.UC_Day14_Queue_Stack;

public class Stack {
	LinkedList list = new LinkedList();
	public void push(Object data)
	{
		list.addLast(data);
	}
	public void display()
	{
		list.display();
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Data structure");
		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display();
	}
	
}
