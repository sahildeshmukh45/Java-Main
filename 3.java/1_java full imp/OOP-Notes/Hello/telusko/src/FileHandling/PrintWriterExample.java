package FileHandling;

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        String FilePath="C:\\Users\\HP\\IdeaProjects\\Hello\\FileCLassExample.txt";
        FileWriter writer = null;
        PrintWriter print=null;
        try{
            File file =new File(FilePath);
            writer=new FileWriter(file,true); //we know if we do not want to override we have to write true here
            print=new PrintWriter(writer);
            //we know previously we cannot write no or object here by the print writer we can write all types of data

            print.println("java");
            print.println(66);
            print.println(97);
            char ch[]={'j','a','v','a'};
            print.println(ch);

        }
        catch(Exception e){
            System.out.println("Some issue");
        }
        finally{
            print.close();
        }
    }
}

