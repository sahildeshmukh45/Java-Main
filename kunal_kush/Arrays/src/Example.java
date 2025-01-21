public class Example {
     int id;
    String name;
     int marks;
     public Example(int ida,String naam,int farks){
         this.id=ida;
         this.name=naam;
         this.marks=farks;
     }
     public Example(int id,int marks){
         this.id=id;
         this.marks=marks;
     }
     public Example(){
         id=5;
         marks=43;

     }

    public static void main(String[] args) {
       Example subash=new Example(1,"subash",45);
       Example sahil=new Example(1,"sahil",3);
       Example aa=new Example();
        System.out.println(aa.id);
    }
}

