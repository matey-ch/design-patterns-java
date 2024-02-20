public class VolvoBus extends Bus {
    protected VolvoBus() {
        super(6_000_000,20);
    }

    @Override
    public void goByWay() {
        System.out.println("Volvo bus runs!");
    }
}
