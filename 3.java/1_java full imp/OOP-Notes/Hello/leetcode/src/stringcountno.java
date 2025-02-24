import java.util.Arrays;
import java.util.HashSet;

public class stringcountno {
    public static void main(String[] args) {
        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(int j=0;j<words.length;j++){
            boolean flag =true;
            for(int i=0;i<words[j].length();i++){
                if(!set.contains(words[j].charAt(i))){
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                count++;
            }
        }
        System.out.println(count);
    }
//    static public int countConsistentStrings(String allowed, String[] words) {
//
//    }
}
