public class booleand {
    public static void main(String[] args) {
        int [][]a={{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};

    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c= matrix[r].length-1;
        while(r<matrix.length & c>=0){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}
