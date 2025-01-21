package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String FilePath="C:\\Users\\HP\\IdeaProjects\\Hello\\FileCLassExample.txt";
        FileWriter writer = null;
        try{
            File file1 =new File(FilePath);
            writer=new FileWriter(file1,true);
            // we are writing true here if the previous data is present there it will overrride that data
            // and if we write the true it will not override the previous data

            writer.write("java");
            writer.write("\n");
            writer.write(67);//it will give asscai value of 67
            writer.write("\n");
            char ch[]={'a','l','i','e','n'};
            writer.write(ch);
            writer.write("\n");
        }
        catch(Exception e){
            System.out.println("Some issue");
        }
        finally{
            writer.close();
        }
    }
}
