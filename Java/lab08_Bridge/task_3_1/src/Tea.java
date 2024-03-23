public class Tea extends Beverage {
    public Tea(int sugar, BeverageAddOn addOn, BeverageServing serving) {
        super(sugar, addOn, serving);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Put some tea...");
        addOn.prepare();
        if (sugar > 0) System.out.printf("Put some sugar     : %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        return 7 + addOn.cost();
    }

    public void drink(){
        System.out.printf(addOn.drink()+serving.drink()+"!%n","tea");
    }
}
