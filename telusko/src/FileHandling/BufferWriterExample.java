package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {
    public static void main(String[] args) throws IOException {
            String FilePath="C:\\Users\\HP\\IdeaProjects\\Hello\\FileCLassExample.txt";
            FileWriter writer = null;
            BufferedWriter bwriter=null;
            try{
                File file =new File(FilePath);
                writer=new FileWriter(file,true); //we know if we do not want to override we have to write true here
                bwriter=new BufferedWriter(writer);

                bwriter.write("java");
                bwriter.newLine();
                bwriter.write(66);
                bwriter.newLine();
                bwriter.write(97);
                char ch[]={'j','a','v','a'};
                bwriter.write(ch);

            }
            catch(Exception e){
                System.out.println("Some issue");
            }
            finally{
                bwriter.flush();
                bwriter.close();

            }
    }
}
