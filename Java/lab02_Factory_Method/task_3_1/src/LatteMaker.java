public class LatteMaker extends BeverageMaker {
    @Override
    protected Beverage makeBeverage(double waterCost, double grainsCost, double sugarCost, double milkCost, double[] prices) {
        return new Latte(waterCost, grainsCost, sugarCost, milkCost, prices);
    }
}
