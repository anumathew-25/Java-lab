/**********************
 * file       :Frequency.java
 * Description:Java program to find the frequency of a given character in a string
 * Author     :Anu Mathew
 * Date       :29/11/2021
 * Version    :1.0
 *************************/
package Day1;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		int count =0;
		System.out.print("Enter a string: ");
		Scanner sc =new Scanner(System.in);
		String input = sc.next();
		System.out.println("The entered string is "+input);
		int length =input.length();
		System.out.print("Enter a character: ");
		char ch=sc.next().charAt(0);
		for(int i=0;i<length;i++) {
			if (input.charAt(i)==ch) {	
			count++;
			}
		}
		System.out.println("The frequency of the given character is "+count);
	}
	}
		

