public class VolvoTrolleybus extends Trolleybus {
    protected VolvoTrolleybus() {
        super(7_000_000,13);
    }

    public void goByContactNetwork() {
        System.out.println("Volvo trolleybus runs");
    }
}
