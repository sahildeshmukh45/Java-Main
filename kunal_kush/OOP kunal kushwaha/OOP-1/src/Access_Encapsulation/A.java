package Access_Encapsulation;

public class A  {
    public static void main(String[] args) {
        add sum=new add();
        System.out.println(sum instanceof A);
        //here sum is instance of add but also A because add extends(inheriate) the class A
        System.out.println(sum.getClass());
    }
}
class add extends A{
    int a;
    int b;
    private int num;
    int add(int a,int b){
        return this.a+this.b;
    }
    // getter get the value
    public int  getNum(int num){
        return num;
    }
    // setter set the value
    public void setNum(int num){
        this.num=num;
    }

}
