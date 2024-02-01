public class Car {
    private Wheel wheel;
    private Engine engine;
    public Car() {
        System.out.println("This is new car being built.");
        this.wheel = new Wheel();
        this.engine = new Engine();
    }
}
