/**********************************************************************
*File        - ExceptionHandling.java
*Author      - Anu Mathew
*Description - Program that shows the usage of try,catch,throws and finally
*Date        - 11/02/2022
*Version     - 1.0 
********************************************************************/
import java.io.IOException;
import java.util.Scanner;
class Throw{
    public void testMethod() throws IOException,ArithmeticException{
        Scanner input=new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int num1=input.nextInt();
            System.out.println("Enter the second number: ");
            int num2=input.nextInt();
            if(num2==0){
                
                throw new ArithmeticException("\nArithmetic Exception Occurred.You should not divide a number by zero");

            }
            else{
                double division=(double)num1/num2;
                System.out.println("Result: "+division);
            }
        }
    }


public class ExceptionHandling {
    public static void main(String args[]) {
        
        try{
            Throw object=new Throw();
            object.testMethod();
            }
        
        catch(ArithmeticException | IOException ex){
            System.out.println(ex);
        }
            
            finally{
                System.out.println("This is final block,exception can't block my execution");
            }

        
    }  
}
