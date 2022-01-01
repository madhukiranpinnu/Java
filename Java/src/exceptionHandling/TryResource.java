package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryResource {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileInputStream fr=new FileInputStream(new File("abc.txt"))){
            System.out.println(10/0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
