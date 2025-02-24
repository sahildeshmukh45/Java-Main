public class secondmax {
    public static void main(String[] args) {
        int[] a = {45, 4, 15, 16, 21, 47, 45, 49};
        int max=0;
        int secondMax=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i = 0; i < a.length; i++){
            if(a[i]>secondMax && a[i]!=max){
                secondMax=a[i];
            }
        }
        System.out.println(secondMax);
    }
}
