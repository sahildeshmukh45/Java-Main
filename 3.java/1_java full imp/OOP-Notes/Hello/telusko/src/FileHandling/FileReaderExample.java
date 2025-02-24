package FileHandling;

import java.io.File;
import java.io.*;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        String FilePath="C:\\Users\\HP\\IdeaProjects\\Hello\\FileCLassExample.txt";
        FileReader reader = null;
        try{
            File file1 =new File(FilePath);
            reader=new FileReader(file1);
//            reader.read();
//            int i= reader.read();
//            System.out.println((char)i);
//            while(i!=-1){
//                System.out.println((char)i);
//                //here if we did not reader.read then it will go in infinite loop because the condition will never
//                // become false it will always give true that is the reason we are writing reader.read
//                i= reader.read();
//            }
            char[] ch=new char[(int)file1.length()];
            reader.read(ch);
            for(char c:ch){
                System.out.println(c);
            }
        }
        catch(Exception e){
            System.out.println("Some issue");
        }
        finally{
            reader.close();
        }
    }
}
