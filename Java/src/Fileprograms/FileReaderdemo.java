package Fileprograms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderdemo {
    public static void main(String args[]) throws IOException {
        File f=new File("readwrite.txt");
        f.createNewFile();
        System.out.println(f.exists());
        FileWriter fw=new FileWriter("readwrite.txt");
        fw.write("madhukiran pinnu");
        fw.write("\n");
        fw.write("madhukiran pinnu");
        fw.write("\n");
        fw.write("\n");
        fw.write("madhukiran pinnu");
        fw.flush();
        fw.close();
        char [] ch=new char[(int)f.length()];
        FileReader fr=new FileReader("readwrite.txt");
        fr.read(ch);
        int i= fr.read();
        for(char c1:ch){
            System.out.print(c1);
        }
        while(i!=-1)
            System.out.print((char)i);
        i= fr.read();
        fr.close();
    }
}
