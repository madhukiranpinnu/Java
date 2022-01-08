package Fileprograms;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriterdemo {
    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("abc.txt",true);
        fw.write(97);
        fw.write("\n");
        char ch='a';
        fw.write(ch);
        fw.write("\n");
        char[] a={'a','b','c','g'};
        fw.write(a);
        fw.write("\n");
        String s="madhukiran";
        fw.write(s);
        fw.flush();
        fw.close();
    }
}
