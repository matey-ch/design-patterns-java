public class EspressoMaker extends BeverageMaker {
    @Override
    protected Beverage makeBeverage(double waterCost, double grainsCost, double sugarCost, double milkCost, double[] prices) {
        return new Espresso(waterCost, grainsCost, sugarCost, prices);
    }
}
