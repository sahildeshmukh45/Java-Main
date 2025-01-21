package FileHandling;

import generics.Student;

import java.io.*;

class student implements Serializable {
    private int id;
    private int age;
    transient private String name;
    public student(int id,int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println("id is  "+id);
        System.out.println("age is "+age);
        System.out.println("Name is "+name);

    }

}
public class SearlisationAndDesearlization {
    public static void main(String[] args) {
//        student s1=new student(1,21,"sahil");
//        s1.display();
        // in serializable interface we don't need to implements the methods whichever present in serializable class yhis markable interface
        // java interanally searlize the class
// if we didint want any varibale to searlize  we will declare transient
// as i have declare name as transist that's called selective serialization
        try {
//            FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\Hello\\telusko\\serial.txt");
//            ObjectOutputStream oos=new ObjectOutputStream(fos); // as file output we can also use bufferoutput
//            oos.writeObject(s1);
//            System.out.println("Check the file");
//            oos.close();
//            fos.close();
            // this was for the creating outputstream means searlization now we will create input-stream means deserialization
            FileInputStream fis=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\Hello\\telusko\\serial.txt");
            ObjectInputStream ois=new ObjectInputStream(fis); //we can also use bufferedinputsream for enhance performance
            student st=(student) ois.readObject();
            st.display();

            fis.close();
            ois.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
