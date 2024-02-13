public class AmericanoMaker extends BeverageMaker {
    @Override
    protected Beverage makeBeverage(double waterCost, double grainsCost, double sugarCost, double milkCost, double[] prices) {
        return new Americano(waterCost, grainsCost, sugarCost, prices);
    }
}
