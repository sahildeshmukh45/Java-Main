package InnerClass;

public class Car {
    private String model;

    private Boolean isEngineOn;

    public Car(String model){
        this.model=model;
        this.isEngineOn=false;
    }

     class Engine{
        void Start(){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println(model + " engine Started");
            }
            else{
                System.out.println(model+ "engines was already started");
            }
        }

        void Stop(){
            if(isEngineOn){
                isEngineOn=false;
                System.out.println(model + " engine stop");
            }
            else{
                System.out.println(model+ "engines was already stopped");
            }
        }
     }
}
