public class HyundaiBus extends Bus {
    protected HyundaiBus() {
        super(5_500_000,20);
    }

    @Override
    public void goByWay() {
        System.out.println("Hyundai bus runs!");
    }
}
