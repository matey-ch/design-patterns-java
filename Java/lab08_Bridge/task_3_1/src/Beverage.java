public abstract class Beverage {

    protected final int sugar;
    protected final BeverageAddOn addOn;
    protected final BeverageServing serving;

    public Beverage(int sugar, BeverageAddOn addOn, BeverageServing serving) {
        this.sugar = sugar;
        this.addOn = addOn;
        this.serving = serving;

    }

    public void prepare(){
        serving.prepare();
        if (sugar > 0) System.out.printf("Put some sugar     : %s pieces ...%n", sugar);
    }

    public abstract void drink();
    public abstract int cost();
}
