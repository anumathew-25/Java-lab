/**********************
 * file       :Inheritance2.java
 * Description:Write a Java program which creates a class named 'Employee' having the following 
 			   members: Name, Age, Phone number, Address, Salary. It also has a method named 
 			  'printSalary()' which prints the salary of the Employee. Two classes 'Officer' 
 			   and 'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes 
 			   have data members 'specialization' and 'department' respectively. Now, assign name,
 			   age, phone number, address and salary to an officer and a manager by making an 
 			   object of both of these classes and print the same.
 * Author     :Anu Mathew
 * Date       :13/12/2021
 * Version    :1.0
 *************************/
package Day3;
import java.util.Scanner;
class Employee1{
    public String name,address;
    public int age,salary;
    public long phoneNumber;
    public void printSalary(){
        System.out.print("The salary of "+name+" is "+salary);
    }
}
class Officer extends Employee1{
    public String specialisation;
    public void details(){
        System.out.println("\nName: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Address: "+address);
        System.out.println("Specialisation: "+specialisation);    
        
        }        
}
class Manager extends Employee1{
    public String department;
    public void details(){
        System.out.println("\nName: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Address: "+address);
        System.out.println("Department: "+department);    
    }
}
public class  Inheritance2 {
    public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    Officer officer= new Officer();
        System.out.println("Enter the name of the officer: ");
        officer.name=input.next();
        System.out.println("Enter the age of the officer: ");
        officer.age =input.nextInt();
        System.out.println("Enter the phone number of the officer: ");
        officer.phoneNumber =input.nextLong();
        System.out.println("Enter the address of the officer: ");
        officer.address =input.next();
        System.out.println("Enter the salary of the officer: ");
        officer.salary = input.nextInt();
        System.out.println("Enter the specialisation of the officer: ");
        officer.specialisation =input.next();

        Manager manager =new Manager();
        System.out.println("Enter the name of the manager: ");
        manager.name=input.next();
        System.out.println("Enter the age of the manager: ");
        manager.age =input.nextInt();
        System.out.println("Enter the phone number of the manager: ");
        manager.phoneNumber =input.nextLong();
        System.out.println("Enter the address of the manager: ");
        manager.address =input.next();
        System.out.println("Enter the salary of the manager: ");
        manager.salary = input.nextInt();
        System.out.println("Enter the department of the manager: ");
        manager.department =input.next();
        input.close();

        
        officer.details();
        officer.printSalary();
        manager.details();
        manager.printSalary();
        
    }
}


	
	
	
