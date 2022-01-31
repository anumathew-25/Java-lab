/**********************
 * file       :Tutorial5.java
 * Description:Write a Java program to copy the contents of one file to another file using FileInputStream and 
               FileOutputStream classes.
 * Author     :Anu Mathew
 * Date       :31/01/2022
 * Version    :1.0
 *************************/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Tutorial5 {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        File file = new File();
        file.copy("MyFile.txt", "NewFile.txt");
    }
}
class File{
    void copy(String str1,String str2) throws FileNotFoundException,IOException{
        FileInputStream fin = new FileInputStream(str1);
        FileOutputStream fout = new FileOutputStream(str2);
        int b= fin.read();
        while(b!=-1){
            fout.write(b);
            b=fin.read();
        }
        fin.close();
        fout.close();
    }
}