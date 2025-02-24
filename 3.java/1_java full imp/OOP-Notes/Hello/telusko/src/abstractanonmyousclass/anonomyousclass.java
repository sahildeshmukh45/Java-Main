package abstractanonmyousclass;

public class anonomyousclass {
    public static void main(String[] args) {
        AB a=new AB()
        {
            public void Show(){
                System.out.println(" in a anonymous class ");
            }
        };
        a.Show();
    }
}
class AB{
    public void Show(){
        System.out.println("In a method");
    }
}
