/**********************
 * file       :Palindrome.java
 * Description:Java program that checks whether string is a palindrome or not
 * Author     :Anu Mathew
 * Date       :29/11/2021
 * Version    :1.0
 *************************/
package Day1;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		int flag=0;
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input =sc.next();
		System.out.println("The entered string is "+input);
		int length=input.length();
		for(int i=0;i<length;i++) {
			if (input.charAt(i)!=input.charAt(length-i-1)) {
				flag=-1;
				break;
			}	
		}
		sc.close();
		if (flag == -1) {
			System.out.print("This is not a Palindrome");
				
			}
		else {
			System.out.print("This is a Palindrome");
			
		}
	}

}
