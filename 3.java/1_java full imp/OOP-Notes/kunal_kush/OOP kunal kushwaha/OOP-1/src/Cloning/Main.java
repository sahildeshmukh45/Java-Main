package Cloning;
import Access_Encapsulation.A;

import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sahil=new Human(45,"Sahil");
//        Human saurabh=new Human(sahil);
        Human saurabh=(Human)sahil.clone();
        System.out.println(saurabh.age);
        System.out.println(Arrays.toString(saurabh.arr));

        saurabh.arr[0]=100;
        System.out.println(Arrays.toString(saurabh.arr));
        System.out.println(Arrays.toString(sahil.arr));

        saurabh.arr[0]=100;
        System.out.println(Arrays.toString(saurabh.arr));
        System.out.println(Arrays.toString(sahil.arr));

    }
}
