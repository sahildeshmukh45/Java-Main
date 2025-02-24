package interfaces.CarExample;

public class car implements Engine,brake,media{
    // all the methods are by default public abstract in interface
    //in inheritance, we cannot inherit more than one class so multiple inheritance is not allowed,but we can implement more than one
    //interfaces is similar to abstraction like interfaces does not contain body
    //we have to declare all the method and function where we implement the interfaces
    //two class that unrelated to each other we can access the all the method which ae present in the interfaces
    // we cannot write finale method in interface we can write static but need to declare the body
    // all the variable are by public static final and all the methods are by default public
    @Override
    public void start() {
        System.out.println("Car  start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public void acc() {
        System.out.println("Car accelerate ");
    }

    @Override
    public void brake(){
        System.out.println("Car brake");
    }
    //we use implements keyword to multiple inheritance

}
