package Enum;

import java.util.Arrays;

enum Status{
    //status is classname
    //enum is class you can make constructor method and everything but you can not extends enum
    // running,failed,area object of that class and also they are constant
    //
    Running,Failed,Pending,Success;
        }
public class Main {
    public static void main(String[] args) {
        Status set=Status.Running;
        //ordinal is index
        System.out.println(set.ordinal());
        // for print all values
        Status[] ss=Status.values();
        for(Status i:ss){
            System.out.println(i);
        }
        if(set==Status.Failed){
            System.out.println("Try again");
        }else if(set==Status.Running){
            System.out.println("System is running");
        }else if(set==Status.Pending){
            System.out.println("Status is pending");
        }
        //we can also use switch statment like
//        switch(s) {
//            case Running:
//                System.out.println("All good");
//                break;
//            case Failed:
//                System.out.println("try again");
//                break;
//        }


    }
}
