public class CappuccinoMaker extends BeverageMaker {

    @Override
    protected Beverage makeBeverage(double waterCost, double grainsCost, double sugarCost, double milkCost, double[] prices) {
        return new Cappuccino(waterCost, grainsCost, sugarCost, prices[0]);
    }
}
