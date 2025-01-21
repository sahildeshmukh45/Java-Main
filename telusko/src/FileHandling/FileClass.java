package FileHandling;
import java.io.*;

public class FileClass {
    public static void main(String[] args) {
        try {
//            File file = new File("C:\\Users\\HP\\IdeaProjects\\Hello\\FileCLassExample.txt");
//            //Here we give file path on which we have to perform read and write if this file is present it will invoke that file
//            System.out.println(file.exists());
//            //This syntax was for whether this file exists or not
//            System.out.println(file.createNewFile());
//            File dir=new File("C:\\Users\\HP\\IdeaProjects\\Hello\\dir");
//            System.out.println(dir.exists());
//            for creating directory
//            dir.mkdir();
            File file2=new File("C:\\Users\\HP\\IdeaProjects\\Hello");
            //for checking how many files are present in above path
            String[] str=file2.list();
            for(String name:str){
                System.out.println(name);
            }
        }
        catch(Exception e){
            System.out.println("Some Problem");
        }
    }
}
