public class Chocolate extends Beverage {
    public Chocolate(int sugar, BeverageAddOn addOn, BeverageServing serving) {
        super(sugar, addOn, serving);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Put some cacao...");
        addOn.prepare();
    }

    @Override
    public int cost() {
        return 15 + addOn.cost();
    }

    public void drink(){
        System.out.printf(addOn.drink()+serving.drink()+"!%n","chocolate beverage");
    }
}
