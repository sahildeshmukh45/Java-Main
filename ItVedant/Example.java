import java.util.Scanner;

public class Example {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       String no=input.nextLine();
       int len=no.length();
       int armStrongNo=0;
       for(int i=0;i<len;i++){
           int newNo=Character.getNumericValue(no.charAt(i));
           armStrongNo +=Math.pow(newNo,len);
       }
        System.out.println(armStrongNo);
       input.close();
    }
}
