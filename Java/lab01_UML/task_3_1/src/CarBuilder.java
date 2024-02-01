public class CarBuilder {
    public CarBuilder(){
        System.out.println("New CarBuilder is being created.");
    }

    public Car buildCar(){
        System.out.println("This CarBuilder now builds a car.");
        return new Car();
    }

    //just to have CarBuilder depend on Wheel and Engine
    public void checkWheelAndEngine(Wheel wheel, Engine engine){
        System.out.println("This method received a wheel and an engine as arguments");
    }


}
