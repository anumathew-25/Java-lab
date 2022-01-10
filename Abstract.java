
/**********************
 * file       :Abstract.java
 * Description:java program to create an abstract class named Shape that contains an empty method named 
               numberOfSides(). Provide three classes named Rectangle, Triangle and Hexagon such that each 
               one of the classes extends the class Shape. Each one of the classes contains only the method 
               numberOfSides() that shows the number of sides in the given geometrical structures.
 * Author     :Anu Mathew
 * Date       :15/12/2021
 * Version    :1.0
 *************************/
package Day3;
abstract class Shape{
    abstract void numberOfSides();

}
class Rectangle extends Shape{
    public void numberOfSides(){
        System.out.println("Number of sides of rectangle is 4");
    }

}
class Triangle extends Shape{
    public void numberOfSides(){
        System.out.println("Number of sides of triangle  is 3");
    }

}
class Hexagon extends Shape{
    public void numberOfSides(){
        System.out.println("Number of sides of hexagon  is 6");
    }

}
public class Abstract{
    public static void main(String[] args){
        Rectangle rectangle =new Rectangle();
        rectangle.numberOfSides();
        Triangle triangle =new Triangle();
        triangle.numberOfSides();
        Hexagon hexagon= new Hexagon();
        hexagon.numberOfSides();


    }
}