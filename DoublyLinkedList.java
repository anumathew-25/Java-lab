/**********************
 * file       :doublyLinkedList.java
 * Description:Write a Java program for the following:
				1) Create a doubly linked list of elements.
				2) Delete a given element from the above list.
				3) Display the contents of the list after deletion.
 * Author     :Anu Mathew
 * Date       :18/02/2022
 * Version    :1.0
 *************************/
package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class DoublyLinkedList {
	public static void main(String args[]) {
		ArrayList list=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		int option,data;
		do {
			System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit\nEnter your option: ");
			option=input.nextInt();
			switch(option) {
			case 1:
				System.out.print("Enter the data to be added: ");
				data=input.nextInt();
				list.add(data);
				System.out.print(list);
				break;
			case 2:
				System.out.print("Enter the position to be deleted(index start from 0): ");
				int pos=input.nextInt();
				data=(int) list.remove(pos);
				System.out.println("Removed element:"+data);
				System.out.println(list);
				break;
			case 3:
				System.out.print(list);	
				break;
			case 4:
				System.out.print("Exit");
				break;
			default:
				System.out.print("Invalid operation");
			}
		}
		while(option<=3);
	}
}
