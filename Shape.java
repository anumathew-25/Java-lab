/**********************
 * file       :Shape.java
 * Description:Java program to find area of different shapes namely circle,rectangle and triangle 
  				using the concept of method overloading
 * Author     :Anu Mathew
 * Date       :06/12/2021
 * Version    :1.0
 *************************/
package Day2;
import java.util.Scanner;

public class Shape {
    public float area(float radius){
        return (float) (3.14*radius*radius);
    }
    public float area(float length,float breadth){
        return (float) (length*breadth);
    }
    public float area(int base,int height){
        return (float) (0.5*base*height);
    }

    public static void main(String[] args){
        System.out.println("Area of Shapes:");
        System.out.println("Choices: \n1.Circle\n2.Rectangle\n3.Triangle");
        Scanner input = new Scanner(System.in);

        Shape s = new Shape();
        System.out.println("Enter your choice: ");
        int choice=input.nextInt();
        if (choice==1){
            System.out.println("Enter the radius of the circle: ");
            float radius = input.nextFloat();
            float areaCircle =s.area(radius);
            System.out.println("Area of Circle: "+areaCircle);
        }
        else if(choice==2){
            System.out.println("Enter the length of the rectangle: ");
            float length =input.nextFloat();
            System.out.println("Enter the breadth of the rectangle: ");
            float breadth =input.nextFloat();
            float areaRectangle =s.area(length,breadth);
            System.out.println("Area of Rectangle: "+areaRectangle);
        }
        else if(choice==3){
            System.out.println("Enter the base length of the triangle: ");
            int base =input.nextInt();
            System.out.println("Enter the height of the triangle: ");
            int height =input.nextInt();
            float areaTriangle =s.area(base,height);
            System.out.println("Area of Triangle: "+areaTriangle);
        }
        else {
        	System.out.println("Invalid!!");
        }
        input.close();
    } 
    
}