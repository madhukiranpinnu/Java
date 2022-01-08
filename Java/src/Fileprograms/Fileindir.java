package Fileprograms;

import java.io.File;
import java.io.IOException;

public class Fileindir {
    public static void main(String args[]) throws IOException {
        File f=new File("kiranfile");
        f.mkdir();
        File f1=new File(f,"demo.txt");
        f1.createNewFile();
        System.out.println(f.exists());
        System.out.println(f1.exists());
    }
}
