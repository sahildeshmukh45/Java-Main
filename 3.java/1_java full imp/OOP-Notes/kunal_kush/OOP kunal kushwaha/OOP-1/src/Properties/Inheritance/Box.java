package Properties.Inheritance;

public  class Box {
   private double l;
   //if we decleared any variable private then it can be only access by the this class in which this is decleared privte
    // also we can take this in construtor or any function but within same class only
    double h;
    double b=6;
    double side;
    int box=1;
   public  Box(){
        this.l=4.5;
        this.h=-1;
        this.b=-1;
    }
    public double getL(){
       return l;
    }
    public void setL(double l){
       this.l=l;
    }
    public Box(double side){
        this.l=side;
        this.h=side;
        this.b=side;
    }public Box(Box other){
        this.l=other.l;
        this.h=other.h;
        this.b=other.b;
    }
    public Box(double l,double h,double b){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void information(){
        System.out.println("Running the box");
        System.out.println(this.l);
    }

}
