public class MilkBeverage implements BeverageAddOn{

    private final int milkVolume;

    public MilkBeverage(int milkVolume){
        this.milkVolume = milkVolume;
    }

    @Override
    public void prepare() {
        System.out.printf("Put some milk : %s ml...%n", milkVolume);
    }

    public String drink() {
        return "Drink %s with milk ";
    }

    @Override
    public int cost() {
        return (int) (milkVolume / 20.0);
    }
}
