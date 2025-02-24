import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//       String in=input.nextLine();
//       switch(in){
//           case "mango":
//               System.out.println("Sweet fruit");
//               break;
//           case "apple":
//               System.out.println("an anpple for the day keep doctors away");
//               break;
//           case "oranges":
//               System.out.println("testy fruit");
//               break;
//           case "grapes":
//               System.out.println("small fruits");
//               break;
//           default:
//               System.out.println("invalid fruit");
//       }
        int no = input.nextInt();
        switch (no) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid no");

                input.close();
        }
    }
}