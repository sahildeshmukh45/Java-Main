package interfaces.CarExample;

public class ElectricEngine implements Engine,brake,cc{
    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelerate ");
    }

    @Override
    public void brake() {
        System.out.println("Electric engine brake");
    }
    public void cc(){
        System.out.println("Electric engine has 150 cc");
    }
}
