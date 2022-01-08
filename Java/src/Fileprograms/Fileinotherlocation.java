package Fileprograms;

import java.io.File;
import java.io.IOException;

public class Fileinotherlocation {
    public static void main(String args[]) throws IOException {
        File f=new File("D:\\javafile","abc.txt");
        f.createNewFile();
        System.out.println(f.exists());
    }
}
