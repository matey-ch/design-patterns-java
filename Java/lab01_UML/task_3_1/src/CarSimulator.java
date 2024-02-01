public class CarSimulator {
    private Car car;
    private CarBuilder builder;
    public CarSimulator(){
        System.out.println("This CarSimulator will now create it's carbuilder and build one car.");
        this.builder = new CarBuilder();
        this.car = builder.buildCar();
    }
}
