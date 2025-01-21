public class qone {
    public static void main(String[] args){
        int n=5;
        System.out.println(fun(5));
        funRev(5);
    }
        static int fun(int x) {
            if (x == 1) {
                System.out.println(x);
                return 1;
            }
            System.out.println(x);
            return fun(x - 1);
        }
    static void funRev(int x) {
        if (x == 0) {
            return;
        }
        funRev(x - 1);
        System.out.println(x);
    }
}
