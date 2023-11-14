package java7.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // create
        try {
            File fo = new File("new-text.txt");
            fo.createNewFile();
            // fo.delete();
            // fo.getName();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // write in the file
        try {
            FileWriter fw = new FileWriter("new-text.txt", true);
            fw.write("ajay");
            fw.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // reading from a file
        try (BufferedReader br = new BufferedReader(new FileReader("new-text.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
        }
        } catch (IOException e) {
            System.out.println(e.getMessage());      
        } 


         // create
        try {
            File fo = new File("random.txt");
            fo.createNewFile();
            if(fo.delete()) {
                System.out.println(fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
