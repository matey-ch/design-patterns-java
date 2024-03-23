public class BlackBeverage implements BeverageAddOn{

    private final int water_volume;

    public BlackBeverage(int water_volume){
        this.water_volume = water_volume;
    }

    @Override
    public void prepare() {
        System.out.printf("Put some hot watter: %s ml...%n", water_volume);
    }

    public String drink() {
        return "Drink black %s ";
    }

    @Override
    public int cost() {
        return 0;
    }
}
