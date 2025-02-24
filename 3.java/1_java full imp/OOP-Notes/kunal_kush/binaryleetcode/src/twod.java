import java.util.Arrays;

class twod{
    public static void main(String [] args){

        int [][]arr={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        System.out.println(Arrays.toString(binarytwod(arr,5)));

    }
    static int[] binarytwod(int [][]a, int target){
        int i=0;
        int j=a[0].length-1;
        while(i<a.length && j>=0){
            if(a[i][j]==target){
                return new int[]{i,j};
            }if(a[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}
