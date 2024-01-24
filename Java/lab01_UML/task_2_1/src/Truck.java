public class Truck implements Vehicle {
    @Override
    public String runTask() {
        return "Truck carrying luggage";
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
