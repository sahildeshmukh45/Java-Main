package Enum;

enum Laptop{
    Macbook(200),XPS(500),Surface(5000),ThinkPad(700);
    private int price;
    private  Laptop(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
       this.price=price;
    }
}
class demo{
    public static void main(String[] args) {
//        Laptop lap=Laptop.Macbook;
//        System.out.println(lap+" "+lap.getPrice());
        Laptop [] aa=Laptop.values();
        for(Laptop i:aa){
            System.out.println(i+": "+i.getPrice());
        }


    }
}