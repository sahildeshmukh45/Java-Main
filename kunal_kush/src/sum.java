import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
//        int x=input.nextInt();
//        int y=input.nextInt();
//        int s=swap(x,y);
//        int x=input.nextInt();
//        int y=input.nextInt();
//        int z=sump(x,y);
//        System.out.println(z);
//        int [] tuv={45,55,66,8,9,7,85,2,5,4,32,56,1,23,55,5};
//        int smallest=smallestElement(tuv);
//        System.out.println( smallest);
//        int x=5;
//        pattern(x);
        String num=input.nextLine();
        armStrong(num);
//        int a=input.nextInt();
//        int b=input.nextInt();
//            swap(a,b);
//        System.out.println(a +"and"+ b);
    }

//    static int sump(int a ,int b){
//            Scanner input=new Scanner(System.in);
//            int sum=a+b;
//            return sum;
//
//    }
//    static int swap(int a,int b){
//        int temp;
//        return temp=a;
//        return a=b;
//        return b=temp;
//
//    }

//    static int smallestElement(int[] x){
//        int len=x.length;
//        int min=x[0];
//        for(int i=1;i<len;i++){
//          if(x[i]<min){
//              min=x[i];
//          }
//        }
//        return min;
//    }

//    static void pattern(int x){
//        for(int i=0;i<=x;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("&");
//            }
//            System.out.println();
//        }
//    }
    static void armStrong(String x) {
        int len = x.length();
        int arm = 0;
        for (int i = 0; i < len; i++) {
            int digit = Character.getNumericValue(x.charAt(i));
            arm += Math.pow(digit, len);
        }
        int y=Integer.parseInt(x);
        if(y==arm){
            System.out.println("it is armstrong no");
        }else{
            System.out.println("It is not a armstrong no");
        }
    }
//    static void swap(int x,int y){
//        int temp=x;
//        x=y;
//        y=temp;
    
    //}
}
