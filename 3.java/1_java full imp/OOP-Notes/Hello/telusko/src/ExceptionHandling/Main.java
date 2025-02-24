package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=4;
        int b=0;
        String str="sahil";
        String str2="sahil1";

        try {
            if (str.equals(str2)) {
                throw new MyException("this is super class");
            }
            Class.forName("opo");
        }
        catch(ClassNotFoundException e){
            System.out.println("not able to find "+ e +" this class");
        }

        catch(MyException e){
            System.out.println("dont enter sahil");
        }
    }
    public static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("cannot be divide by zero");
        }
        return a/b;
    }
}