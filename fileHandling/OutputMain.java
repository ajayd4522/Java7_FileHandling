package java7.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputMain {
    public static void main(String[] args) throws IOException {
        
        // output
        // OutputStream os = System.out;
        // os.write(😍);

        // // OUTPUT STREAM WRITER
        // try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            
        //     osw.write("Hello World");
        //     osw.write('\n');
        //     osw.write(100);
        //     osw.write('\n');
        //     osw.write(15000);
        //     osw.write('\n');
        //     osw.write('A');
        //     osw.write('\n');
        //     char [] arr = "hello world".toCharArray();
        //     osw.write(arr);
        //     osw.write('\n');
        //     osw.write("223");
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }

        // // FILE WRITER
        // try (FileWriter fr = new FileWriter("F:\\java\\vscode java\\java7\\fileHandling\\note.txt")){
        //     fr.write("heeeeeee");
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }

        // BUFFERED WRITER
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\java\\vscode java\\java7\\fileHandling\\note.txt", true))){
            bw.write("hare radha");
            bw.write("hare krishna");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}