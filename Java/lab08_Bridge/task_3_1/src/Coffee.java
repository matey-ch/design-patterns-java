public class Coffee extends Beverage {

    final private boolean extra_coffee;
    public Coffee(int sugar, BeverageAddOn addOn, BeverageServing serving, boolean extra_coffee) {
        super(sugar, addOn, serving);
        this.extra_coffee = extra_coffee;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Put some coffee...");
        if (extra_coffee) System.out.println("Put extra coffee...");
        addOn.prepare();
    }

    @Override
    public int cost() {
        return 10 + addOn.cost();
    }

    public void drink(){
        System.out.printf(addOn.drink()+serving.drink()+"!%n","coffee");
    }


}
