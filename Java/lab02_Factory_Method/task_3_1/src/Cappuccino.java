public class Cappuccino extends Beverage {

    private double price;


    private static double water_amount = 0.3;
    private static double grains_amount = 0.2;

    public Cappuccino(double waterCost, double grainsCost, double sugarCost, double price){
        this.waterCost =waterCost;
        this.grainsCost =grainsCost;
        this.sugarCost =sugarCost;
        this.price = price;
    }

    @Override
    public double calculate_profit(char size, double sugarAmount) {
        return -(water_amount* waterCost +grains_amount* grainsCost) - sugarCost * sugarAmount + price;
    }

}
