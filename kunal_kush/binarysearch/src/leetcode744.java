public class leetcode744 {
    public static void main(String[] args){
        char [] ch={'a','b','c','d','e'};
        char m=nextgl(ch,'c');
         System.out.println(m);
    }
    static char nextgl(char[] letters,char target){
        int start=0;
        int end = letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
            if(start==letters.length){
                return letters[0];
            }
        }
        return letters[start];
    }
}
