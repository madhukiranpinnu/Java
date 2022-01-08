package Fileprograms;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriterdemo {
    public static void main(String arg[]) throws IOException {
        PrintWriter fw =new PrintWriter("filewriter.txt");
        fw.print(100);
        fw.println(true);
        fw.println("madhu");
        fw.println(10.5);
        fw.println('a');
        fw.flush();
        fw.close();

    }
}
