package interfaces.CarExample;

public class CdPlayer implements media{

    @Override
    public void start(){
        System.out.println("Media start");
    }
    @Override
    public void stop(){
        System.out.println("Media stop");
    }
}
