
package interfaces.CarExample;

public class main {
    public static void main(String[] args) {
        car car=new car();
        //same like previous at run time it will decide which method to run
        car.start();
        car.stop();
        car.acc();
        // in the above type if we call start or stop it will start or stop the engine but what if we want to stop music
        // we call two different classes and by using their method we are making our car
        // and by this we made our car and this is also the example of multiple inheritance
        Ferrari sf=new Ferrari();
        sf.engineStart();
        sf.engineStop();
        sf.acc();
        sf.mediaStart();
        sf.mediaStop();
        sf.upgradeEngine();
        sf.engineStart();
        sf.carBrake();
        sf.engineStart();
        sf.hpOrCc();
        //annotations (@override) are also interfaces
    }
}
