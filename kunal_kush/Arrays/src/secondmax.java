public class secondmax {
    public static void main(String[] args) {
        int[] a = {2,7,5,4,3};
        int max=0;
        int secondMax=0;
        int thirdLargest=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]>secondMax && a[i]!=max){
                secondMax=a[i];
            }
            if(a[i]>thirdLargest && a[i] != secondMax && a[i] != max){
                thirdLargest=a[i];
            }
        }
        System.out.println(thirdLargest);
    }
}
