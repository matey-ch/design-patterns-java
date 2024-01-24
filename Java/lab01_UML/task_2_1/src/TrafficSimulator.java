import java.util.Random;

public class TrafficSimulator {
    public static void main(String[] args) {

        for (int i=0; i<10; i++){
            Vehicle vehicle = createRandomCar();
            System.out.println(vehicle.getType());
            System.out.println(vehicle.runTask());
        }

    }

    public static Vehicle createRandomCar(){
        Random random = new Random();
        boolean isCar = random.nextBoolean();
        if (isCar){
            return new Car();
        }
        else{
            return new Truck();
        }
    }
}
