/**********************
 * file       :FileHandling.java
 * Description:Write a file handling program in Java with reader/writer.
               create a file sample.txt and store the inputs given from the keyboard.after execution of program 
               a new file is generated with name "new-sample.txt" with the contents from sample.txt.
 * Author     :Anu Mathew
 * Date       :21/01/2022
 * Version    :1.0
 *************************/

import java.io.*;
public class FIleHandling {
    public static void main(String args[]) throws IOException{
        //File file = new File("sample.txt"); 
           
            try { 
                FileOutputStream  fout = new FileOutputStream("sample.txt",true);
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                System.out.println("enter data");
                String s=br.readLine();
                byte[] arr = s.getBytes();
                fout.write(arr);
                System.out.println("data added");
                fout.close();
            }
            catch (Exception e) {
                System.out.println("File Not Found");
            } 
                
            int i=0;
            
            FileInputStream file = new FileInputStream("sample.txt");
            System.out.println("Data in the file: ");
            while((i=file.read())!=-1) {
            //Converts Byte to Character
                char c = (char)i;
                System.out.print(c);
            }
            file.close();
            
            //new file
           
            try {   
                FileInputStream  fin = new FileInputStream("sample.txt");
                FileOutputStream  fout = new FileOutputStream("new-sample.txt",true);
                int c;
                while((c=fin.read())!=-1){
                    fout.write(c);
                }
                fin.close();
                fout.close();
                }
                catch (Exception e) {
                    System.out.println("File Not Found");
                } 
                FileInputStream fout = new FileInputStream("new-sample.txt");
                int j;
                System.out.println("");
                System.out.println("\nContent in new-sample is ");
                while((j=fout.read())!=-1) {
                //Converts Byte to Character
                    char c = (char)j;
                    System.out.print(c);
                }
                fout.close();
            
    }
}

