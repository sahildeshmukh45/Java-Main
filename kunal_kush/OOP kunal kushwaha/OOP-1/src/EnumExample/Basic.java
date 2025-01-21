package EnumExample;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constants
        //public,static and final
        //since its final you cannot create child class
        //type is week
        Week(){
            System.out.println("Constructor called for"+ this);
        }
        // this is not public or protected ,only private or default
        //why?  we do not want to create new object
        // this is not enum concept,that is why
        // internally public static final Week a=new Week();
    }

    public static void main(String[] args) {
        Week a= Week.Monday;
//       for(Week day:Week.values()){
//           System.out.println(day);
//       }


    }
}
