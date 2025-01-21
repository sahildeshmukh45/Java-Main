package Singelton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Singleton obj=Singleton.getInstance();

        Singleton obj2=Singleton.getInstance();


        Singleton obj3=Singleton.getInstance();
        //no matter how many object you create it only create one object and make changes in that object
    }
}
