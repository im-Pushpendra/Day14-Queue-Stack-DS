package com.bridgelabz.day14.UC_Day14_Queue_Stack;

import java.util.Scanner;
public class LinkedList {
	Node head;

	class Node {
		Object data;
		Node ref;

		Node(Object data) {
			this.data = data;
		}
	}
	public void addLast(Object data)
	{
		Node newNode = new Node(data);
		Node temp = head;
		if(head == null)
			head = newNode;
		else if(head.ref == null)
			head.ref = newNode;
		else
		{
			while(temp.ref != null)
			{
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}
	
	public void display()
	{
		Node temp = head;
		if(head == null)
			System.out.println("No elements to show.");
		else {
			while(temp != null)
			{
				if(temp.ref != null)
					System.out.print(temp.data+" > ");
				else
					System.out.println(temp.data);
				
				temp = temp.ref;
			}
		}
	}

//	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		Scanner sc = new Scanner(System.in);
//		list.addLast(56);
//		list.addLast(30);
//		list.addLast(70);
//		list.display();
//		
//	}

}
