import com.customs.Auto;
import com.customs.Customs;
import com.customs.CustomsAdapter;
import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.TruckCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(5, "Audi", 0.2f, 100_000);
        VehicleCalculator calculator = new CarCalculator();
        calculator.setVehicle(vehicle);
        System.out.println(calculator.calculatePrice());

        Auto auto = new Auto(5,"Audi",true,100_000);
        Customs customs = new CustomsAdapter(calculator, new TruckCalculator());
        System.out.println(customs.vehiclePrice(auto)+" "+customs.tax(auto));
    }


}
