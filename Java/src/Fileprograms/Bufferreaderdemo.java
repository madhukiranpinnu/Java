package Fileprograms;

import java.io.*;

public class Bufferreaderdemo {
    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("abc.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write('g');
        bw.newLine();
        bw.write("madhukiran pinnu");
        bw.newLine();
        char ch[]={'a','b','c'};
        bw.write(ch);
        bw.newLine();
        bw.write("kilo ghu jijokmk");
        bw.flush();
        bw.close();
        FileReader fr=new FileReader("abc.txt");
        BufferedReader br=new BufferedReader(fr);
        String s=br.readLine();
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }
        br.close();
    }
}
