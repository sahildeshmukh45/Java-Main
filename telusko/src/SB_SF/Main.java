package SB_SF;

import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        String name =new String("sahil");
        System.out.println(name.hashCode());
        System.out.println(name.concat(" Deshmukh"));
        String a="sahil.saurabh.rushikesh.anil";

       String b[]=a.split("[.]");
        System.out.println(Arrays.toString(b));

        //StringBuffer is use for modifying the StringBuffer
        StringBuffer sb=new StringBuffer("sahil");
        sb.append("deshmukh");
        System.out.println(sb);

        // if we want to conver stingbuffer to string then
        String str=sb.toString();
        System.out.println(str);

    }
}