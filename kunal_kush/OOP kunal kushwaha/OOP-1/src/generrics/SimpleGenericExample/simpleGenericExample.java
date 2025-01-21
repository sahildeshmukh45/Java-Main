package generrics.SimpleGenericExample;

public class simpleGenericExample {
    public static void main(String[] args) {
        Test<String,Integer>aa=new Test<String,Integer>("sahil",36);
        aa.print();
        aa.setA("saurabh");
        aa.print();

    }
}


