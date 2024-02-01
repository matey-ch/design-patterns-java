public class Main {
    public static void main(String[] args) {
        CarSimulator sim = new CarSimulator();


        Wheel wheel = new Wheel();
        Engine engine = new Engine();
        CarBuilder builder = new CarBuilder();
        builder.checkWheelAndEngine(wheel, engine);
    }
}
