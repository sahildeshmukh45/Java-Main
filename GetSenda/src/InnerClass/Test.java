package InnerClass;

public class Test {
    public static void main(String[] args) {
        Car safari= new Car("Tata Safari");
       Car.Engine engine= safari.new Engine();

       engine.Start();
       engine.Stop();

    }
}
