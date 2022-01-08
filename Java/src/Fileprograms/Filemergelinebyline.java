package Fileprograms;

import java.io.*;

public class Filemergelinebyline {
    public static void main(String args[]) throws IOException {
        PrintWriter  pw=new PrintWriter("file4.txt");
        BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
        BufferedReader br1=new BufferedReader(new FileReader("file2.txt"));
        String line1=br.readLine();
        String line=br1.readLine();
        while(line1!=null||line!=null){
            if(line1!=null){
                System.out.println(line1);
                pw.println(line1);
                line1=br.readLine();
            }
            if(line!=null){
                System.out.println(line);
                pw.println(line);
                line=br1.readLine();
            }
        }
       pw.flush();;
       pw.close();
       br.close();
       br1.close();
    }
}
