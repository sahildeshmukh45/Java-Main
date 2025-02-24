import java.io.*;

public class Serialization implements Serializable {

    public static void main(String[] args) throws FileNotFoundException {
        // serialization,
        // serialization means converting objects to byteStream
        String fileName="C:\\Users\\HP\\2.Springboot\\Serialized.txt";
        Student student =new Student();
        student.id=5;
        student.name="Sahil";

        try{
            FileOutputStream fileOutputStream= new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}