package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comprator{
    public static void main(String[] args){
        Comparator<String>aa=new Comparator<String>() {
            @Override
            public int compare(String i, String j) {

                if(i.length()>j.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        List<String> str=new ArrayList<>();
        str.add("a");
        str.add("aaaa");
        str.add("aa");
        str.add("aaa");
        str.add("aaaaaaaa");
        Collections.sort(str,aa);
        System.out.println(str);
    }
}

