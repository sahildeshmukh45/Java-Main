package interfaces.CarExample;

public class PowerEngine implements Engine,brake,cc{
    @Override
    public void start() {
        System.out.println("PowerEngine start");
    }

    @Override
    public void stop() {
        System.out.println("power engine stop");
    }

    @Override
    public void acc() {
        System.out.println("power engine accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Power engine brake");
    }
    public void cc(){
        System.out.println("power engine has 1200 hp");
    }
}
