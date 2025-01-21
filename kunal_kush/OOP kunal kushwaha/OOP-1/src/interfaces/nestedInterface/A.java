package interfaces.nestedInterface;

public class A {
    //nested interface
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        if(num==0|| num%2==0){
            return false;
        }
        return true;
    }
}
