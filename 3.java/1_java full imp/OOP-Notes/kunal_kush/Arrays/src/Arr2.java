import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Arr2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String[][] str={
//                {"sahil","rushi","pratik"},
//                {"prasad","hruturaj"},
//                {"Xyz"}
//
//        };
      //  for(int i=0;i<str.length;i++){
      //  System.out.println(Arrays.toString(str[i]));}


        String[][] str=new String[3][2];
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length;j++){
                 str[i][j]=input.nextLine();
            }
        }
//        for(int i=0;i<str.length;i++){
//            for(int j=0;j<str[i].length;j++){
//                System.out.println(str[i][j] + " ");
           // }
        for(int i=0;i<str.length;i++){
            System.out.println(Arrays.toString(str[i]));
        }

    }
}
