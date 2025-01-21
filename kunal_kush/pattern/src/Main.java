public class Main {
    public static void main(String[] args) {
        pattern5(3);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){                            //  *
            for(int col=1;col<=row;col++){                      //  **
                System.out.print("* ");                         //  ***
            }                                                   //  ****
            System.out.println();                               //  *****
        }
    }
    static void pattern2(int n){                                 // *****
        for(int row=n;row>=1;row--){                             // ****
            for(int col=1;col<=row;col++){                       // ***
                System.out.print("* ");                          // **
            }                                                    // *
            System.out.println();
        }
    }
    static void pattern3(int n){                // same as 1st but here we are printing no
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1;row<=n;row++){               // *
            int NoOfCol=row;                       // **
            if(NoOfCol<=(n/2)+1){                  // ***
            for(int col=1;col<=row;col++){         // ****
                System.out.print("* ");            // ***
            }                                      // **
            System.out.println();                  // *
            }
        }
        for(int row=(n/2);row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}