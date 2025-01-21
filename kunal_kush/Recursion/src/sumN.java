public class sumN {
    public static void main (String[] args){
        System.out.println(sumOfN(5));
    }
    static int sumOfN(int x){
        if(x==1){
            return 1;
        }
        return x+sumOfN(x-1);
    }
}
