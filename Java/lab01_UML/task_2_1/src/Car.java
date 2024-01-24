public class Car implements Vehicle {
    @Override
    public String runTask() {
        return "Car carrying passengers";
    }

    @Override
    public String getType() {
        return "Car";
    }
}
