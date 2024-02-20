public class HyundaiTrolleybus extends Trolleybus {
    protected HyundaiTrolleybus() {
        super(7_000_000,11);
    }

    public void goByContactNetwork() {
        System.out.println("Hyundai trolleybus runs");
    }
}
