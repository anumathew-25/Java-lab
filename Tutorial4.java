/**********************
 * file       :Tutorial4.java
 * Description:Write a Java program to create a new file named ‘MyFile.txt’ and write the statement “This is the 
               University Exam for OODP. This a program to illustrate the use of files.” into the file with each 
               sentence in the statement representing a new line in the file.
 * Author     :Anu Mathew
 * Date       :31/01/2022
 * Version    :1.0
 *************************/
import java.io.FileWriter;
import java.io.IOException;

public class Tutorial4 {
    public static void main(String [] args) throws IOException{
        FileWriter f = new FileWriter("MyFile.txt"); 
        String text = "This is the University Exam for OODP.This a program to illustrate the use of files";
        f.write(text.replace(".", ".\n"));
        f.close();
    }
}