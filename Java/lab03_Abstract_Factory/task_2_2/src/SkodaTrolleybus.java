public class SkodaTrolleybus extends Trolleybus {
    protected SkodaTrolleybus() {
        super(6_800_000,12);
    }

    public void goByContactNetwork() {
        System.out.println("Skoda trolleybus runs");
    }
}
