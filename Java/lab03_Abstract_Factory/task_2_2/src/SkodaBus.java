public class SkodaBus extends Bus {
    protected SkodaBus() {
        super(4_500_000,25);
    }

    @Override
    public void goByWay() {
        System.out.println("Skoda bus runs!");
    }
}
