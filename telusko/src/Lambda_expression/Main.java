package Lambda_expression;

public class Main {
    public static void main(String[] args) {
        A obj= (a)-> { System.out.println("i am in show " + a);};
        obj.show(6);
    }
}
