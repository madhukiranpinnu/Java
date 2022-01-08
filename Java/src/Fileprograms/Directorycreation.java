package Fileprograms;

import java.io.File;
import java.io.IOException;

public class Directorycreation {
    public static void main(String args[]) throws IOException {
        File f=new File("madhukiran");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}
