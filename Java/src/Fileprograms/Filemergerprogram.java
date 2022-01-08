package Fileprograms;

import java.io.*;

public class Filemergerprogram {
    public static void main(String args[]) throws IOException {
        PrintWriter pw=new PrintWriter("file3.txt");
        FileReader fr=new FileReader("file1.txt");
        BufferedReader br =new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null){
            pw.println(line);
            line= br.readLine();
        }
        fr=new FileReader(new File("file2.txt"));
        br=new BufferedReader(fr);
        line=br.readLine();
        while(line!=null){
            pw.println(line);
            line= br.readLine();
        }
        pw.flush();
        pw.close();
    }
}
