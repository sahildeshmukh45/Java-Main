import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Arrlis2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            a.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                a.get(i).add(input.nextInt());
            }
        }
        for(int i=0;i<3;i++){
                System.out.println(a.get(i));
        }
    }
}

