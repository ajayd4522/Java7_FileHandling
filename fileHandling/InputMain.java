package java7.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputMain {
    public static void main(String[] args) {
        
        // try (InputStreamReader isr = new InputStreamReader(System.in)){
        //     System.out.print("Enter some lettres : ");
        //     int letters = isr.read();
        //     while(isr.ready()){
        //         System.out.println((char) letters);
        //         letters = isr.read();
        //     }
        //     // System.out.println();

        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }

        // try (FileReader fr = new FileReader("note.txt")){
        //     // System.out.print("Enter some lettres : ");
        //     int letters = fr.read();
        //     while(fr.ready()){
        //         System.out.print((char) letters);
        //         letters = fr.read();
        //     }
        //     System.out.println();

        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }

        // More understandable way of writting
        // try (FileReader fr = new FileReader("F:\\java\\vscode java\\java7\\fileHandling\\note.txt")){
        // //   FileReader fr=new FileReader("D:\\testout.txt");    
        //   int i;    
        //   while((i=fr.read())!=-1)    
        //   System.out.print((char)i);    
        // //   fr.close();

        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }
        
        // // byte to char stream and then reading char stream
        // try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //     System.out.println("You typed : " + br.readLine());
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }

        try (BufferedReader br = new BufferedReader(new FileReader("F:\\java\\vscode java\\java7\\fileHandling\\note.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
