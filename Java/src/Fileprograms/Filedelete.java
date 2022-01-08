package Fileprograms;


import java.io.*;

public class Filedelete {
    public static void main(String args[]) throws IOException, IOException {
        File f=new File("mobilenumber.txt");
        f.createNewFile();
        File f1=new File("oldset.txt");
        f1.createNewFile();
        PrintWriter pw=new PrintWriter("mobilenumber.txt");
        BufferedReader br=new BufferedReader(new FileReader("oldset.txt"));
        String line1=br.readLine();
        while(line1!=null){
            boolean available=false;

            File f2=new File("delete.txt");
            f2.createNewFile();
            BufferedReader br1=new BufferedReader(new FileReader("delete.txt"));
            String line2=br1.readLine();
            if(line2.equals(line1)){
                available=true;
                break;
            }
            if(available=false){
                pw.println(line1);
            }
        }
    }
}
