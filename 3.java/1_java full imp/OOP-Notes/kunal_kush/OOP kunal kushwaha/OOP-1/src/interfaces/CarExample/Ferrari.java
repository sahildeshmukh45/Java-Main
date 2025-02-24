package interfaces.CarExample;

public class Ferrari {
    // we call two different classes and by using their method we are making our car
    // and by this we made our car and this is also the example of multiple inheritance
    private Engine engine=new PowerEngine();
    private  media player=new CdPlayer();
    private brake brake=new PowerEngine();
    private cc cc=new PowerEngine();
    //we create this method to upgrade our engine from PowerEngine to ElectricEngine
    public void upgradeEngine(){
        engine=new ElectricEngine();
        brake=new ElectricEngine();
        cc=new ElectricEngine();
        // we are changing both the engine for car also and for brake also
    }
    //here we are calling our start method
    public void engineStart(){
        engine.start();
    }
    public void engineStop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void mediaStart(){
        player.start();
    }
    public void mediaStop(){
        player.stop();
    }
    public void carBrake(){
        brake.brake();
    }
    public void hpOrCc(){
        cc.cc();
    }
}
