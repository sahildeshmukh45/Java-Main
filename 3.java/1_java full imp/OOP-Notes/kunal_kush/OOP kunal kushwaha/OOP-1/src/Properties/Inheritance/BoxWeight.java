package Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;
    int boxweight=2;
    BoxWeight(){
        super();
//        this.weight=-1;
    }
    public BoxWeight(double l,double h,double b,double weight){
        super(l, h, b);//Parent class constructor and always intialized parents class constructor first in child class
        this.weight=weight;
        //super keyword can also use for access super class values like in the above weight is present
        // in both Box and BoxWeight sos to refer the value of Box class we can write super.weight;
//        System.out.println(super.weight);
    }
    public BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
    public BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }
    void checkFun(){
        System.out.println("checking");
    }

}