package generrics.SimpleGenericExample;

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