/**********************
 * file       :Inheritance.java
 * Description:Write two Java classes Employee and Engineer. Engineer should inherit from 
 			   Employee class. Employee class to have two methods display() and calcSalary().
 			   Write a program to display the engineer salary and to display from Employee class
 			   using a single object instantiation (i.e., only one object creation is allowed).
 * Author     :Anu Mathew
 * Date       :13/12/2021
 * Version    :1.0
 *************************/
package Day3;
import java.util.Scanner;
class Employee{
	public int basicSalary,DA,HRA;
	public double grossSalary;
	public void display() {
		System.out.println("The gross salary of the engineer is "+grossSalary);
	}
	public void calcSalary(){
		this.grossSalary=basicSalary+(double)(DA*basicSalary)/100+(double)(HRA*basicSalary)/100;
		
	}
}
class Engineer extends Employee{
	public void salaryDetails(){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the  basic salary of the Engineer: ");
	this.basicSalary=input.nextInt();
	System.out.println("Enter the DA of the Engineer: ");
	this.DA=input.nextInt();
	System.out.println("Enter the HRA of the Engineer: ");
	this.HRA=input.nextInt();
	input.close();
}
	
}
public class Inheritance {
	public static void main(String[] args) {
		Engineer engg= new Engineer();
		engg.salaryDetails();
		engg.calcSalary();
		engg.display();
}
}
