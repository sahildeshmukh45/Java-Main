package Generics;

public class Main {
    public static void main(String[] args) {


        Student studentOp = new Student();
        Student<Student>student = new Student<>(studentOp);

        student.display();

    }
}
