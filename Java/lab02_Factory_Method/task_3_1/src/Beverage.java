public abstract class Beverage {
    protected double waterCost;
    protected double sugarCost;
    protected double grainsCost;


    public abstract double calculate_profit(char size, double sugarAmount);

}
