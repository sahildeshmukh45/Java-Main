import java.io.*;

public class Deserialization implements Serializable{
    public static void main(String[] args) {
        String fileName="C:\\Users\\HP\\2.Springboot\\Serialized.txt";
        try{
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);

            Student obj= (Student) objectInputStream.readObject();
            System.out.println(obj.id);
            System.out.println(obj.name);

            objectInputStream.close();
            fileInputStream.close();

        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
