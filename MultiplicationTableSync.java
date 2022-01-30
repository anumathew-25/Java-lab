/**********************************************************************
*File        - MultiplicationTableSync.java
*Author      - Anu Mathew
*Description - Java program that shows thread synchronization.Demonstrate the execution of different Multipllication
               Tables in a synchronized manner using thread synchronization..
*Date        - 29/1/2021
*Version     - 1.0 
********************************************************************/
import java.util.Scanner;
class MultiplicationTable {
    synchronized void printTable(int num){
        for(int i=1;i<11;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
class Thread1 extends Thread{
    int num1;
    MultiplicationTable t;
    Thread1(MultiplicationTable t,int n1){
        this.t=t;
        num1=n1;
    }
    public void run(){
        t.printTable(num1);
    }
}
class Thread2 extends Thread{
    int num2;
    MultiplicationTable t;
    Thread2(MultiplicationTable t,int n2){
        this.t=t;
        num2=n2;
    }
    public void run(){
        t.printTable(num2);
    }
}
class Thread3 extends Thread{
    int num3;
    MultiplicationTable t;
    Thread3(MultiplicationTable t,int n3){
        this.t=t;
        num3=n3;
    }
    public void run(){
        t.printTable(num3);
    }
}
public class MultiplicationTableSync{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Table you want to run by thread1: ");
        int num1=input.nextInt();
        System.out.print("Enter the Table you want to run by thread2: ");
        int num2=input.nextInt();
        System.out.print("Enter the Table you want to run by thread3: ");
        int num3=input.nextInt();
        MultiplicationTable table=new MultiplicationTable();
        Thread1 t1=new Thread1(table,num1);
        Thread2 t2=new Thread2(table,num2);
        Thread3 t3=new Thread3(table,num3);
        t1.start();  
		t2.start(); 
        t3.start();
        input.close();
    }
}