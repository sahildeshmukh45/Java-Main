package Properties.Inheritance;

public class BoxPrice extends BoxWeight {
    int boxprice=3;
    double cost = 46;

    BoxPrice() {
        super();
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l,double b,double h,double weight,double cost){
        super(l, h, b, weight);
        this.cost=cost;
    }
    public BoxPrice(double side ,double weight,double cost){
        super(side, weight);
        this.cost=cost;
    }
}