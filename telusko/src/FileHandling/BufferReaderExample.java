package FileHandling;
import java.io.*;

public class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\HP\\IdeaProjects\\Hello\\FileCLassExample.txt";
        FileReader reader=null;
        BufferedReader br=null;
        try{
            File file=new File(filePath);
            reader=new FileReader(file);
            br=new BufferedReader(reader);

            String str =br.readLine();
            while(str!=null){
                System.out.println(str);
                str=br.readLine();
            }
        }
        catch(Exception e){
            System.out.println("Something is wrong");
        }
        finally{
            br.close();
        }
    }
}
