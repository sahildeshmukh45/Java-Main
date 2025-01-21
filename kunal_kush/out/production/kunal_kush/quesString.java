import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class quesString {
    public static void main(String[]  args){
        System.out.println(search("Sahil",'s'));
    }
    static boolean search(String a,char  target){
        Scanner input=new Scanner(System.in);
        for(int i=0;i<a.length();i++){
            char f=target;
            a=a.toLowerCase();
            if(a.charAt(i)==f){
                return true;
            }
        }
        return false;
    }
}
