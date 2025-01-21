public class DeciamltoBinary {
    public static void main(String args[]){
        System.out.println(asdf(1010));
        System.out.println(decimalToString(10));

    }
    static int asdf(int num){ //1010
        String num2= String.valueOf(num);
        int ans=0;
        int j=0;
        for(int i=num2.length()-1;i>=0;i--) {
                int newDigit = Character.getNumericValue(num2.charAt(i));
                ans += newDigit* Math.pow(2,j);
                j++;
        }
        return ans;
    }
    static String decimalToString(int num){
        String num2=String.valueOf(num);
        String ans="";
        while(num>0){
            int rem=num%2;
            ans= rem+ ans;
            num=num/2;
        }
        return ans;
    }
}
