import java.util.Arrays;


public class max_array {
    public static void Main(String[] args){
        int[] m={11,21,12,13,14,15,17,18,19};
        int aa=max(m);
        System.out.println(aa);
    }
    static int max(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    static int maxinrange(int[] a,int startingindex,int endingindex) {
        int max = a[startingindex];
        for (int i = startingindex; i <= endingindex; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
