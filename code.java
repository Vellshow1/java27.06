/**
 * code
 */
import java.io.*;
public class code {

    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("note.txt");
            FileOutputStream fos = new FileOutputStream("new_file.txt")){
            byte[] buffer = new byte[256];
            int i;
            while ((i = fin.read(buffer)) != -1) {
                System.out.print((char)i);
                fos.write(buffer,0,i);                
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}