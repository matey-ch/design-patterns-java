public class HyundaiTram extends Tram {
    protected HyundaiTram() {
        super(9_500_000, 6);
    }

    @Override
    public void goByRails() {
        System.out.println("Hyundai tram runs!");
    }
}
