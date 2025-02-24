import java.util.Scanner;
import java.util.ArrayList;




public class arrlist {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.set(1,Integer.valueOf(45));
//        a.remove(Integer.valueOf(45));
//        System.out.println(a.toString());
        ArrayList<Integer>b=new ArrayList<Integer>();
        int in=input.nextInt();
        for(int i=0;i<in;i++){
            b.add( input.nextInt());
        }
      //  System.out.println(b.toString());
        for(int i=0;i<in;i++){
            System.out.println(b.get(i));
        }
    }
}
