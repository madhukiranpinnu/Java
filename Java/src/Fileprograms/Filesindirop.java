package Fileprograms;

import java.io.File;
import java.io.IOException;

public class Filesindirop {
    public static void main(String args[]) throws IOException {
        File f=new File("D:\\javafile","sriram1.txt");
        f.createNewFile();
        File f1=new File("D:\\javafile","sriram2.txt");
        f1.createNewFile();
        File f2=new File("D:\\javafile","sriram3.txt");
        f2.createNewFile();
        File f3=new File("D:\\javafile","sriram4.txt");
        f3.createNewFile();
        File f4=new File("D:\\javafile");
        String [] files= f4.list();
        for(String file :files) {
            File f5 = new File(f4, file);
            if (f5.isFile()) {
                System.out.println(file.split("[.]")[0]);
            }
        }
    }
}
