public class RecursionPattern {
    public static void main(String[] args) {
  patternOne(5,0);
  patternTwo(5,0);
    }
    static void patternOne(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            patternOne(r,c+1);
        }else{
            System.out.println();
            patternOne(r-1,0);
        }
    }
    static void patternTwo(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            patternTwo(r,c+1);
            System.out.print("* ");
        }else{
            patternTwo(r-1,0);
            System.out.println();
        }
    }
}
