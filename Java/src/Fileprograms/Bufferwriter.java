package Fileprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferwriter {
    public static void main(String args[]) throws IOException {
        FileWriter fw =new FileWriter("abc.txt");
        BufferedWriter bw =new BufferedWriter(fw);
        bw.write('c');
        bw.newLine();
        bw.write("madhukiran");
        bw.newLine();
        char ch[]={'f','g','k'};
        bw.write(ch);
        bw.flush();
        bw.close();
    }
}
