package generrics;

public class simpleGenericExample {
    public static void main(String[] args) {
        Test<String,Integer>aa=new Test<String,Integer>("sahil",36);
        aa.print();
        aa.setA("saurabh");
        aa.print();

    }
}
class Test<String,Integer>{
    String a;
    Integer b;
    Test(String a,Integer b){
        this.a=a;
        this.b=b;
    }
    public void print(){
        System.out.println(a);
        System.out.println(b);
    }
    public void setA(String a){
        this.a=a;
    }
}

