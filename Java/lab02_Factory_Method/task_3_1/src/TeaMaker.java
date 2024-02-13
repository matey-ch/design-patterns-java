public class TeaMaker extends BeverageMaker {

    public void setLeavesCost(double leavesCost){
        this.setGrainsCost(leavesCost);
    }

    @Override
    protected Beverage makeBeverage(double waterCost, double leavesCost, double sugarCost, double milkCost, double[] prices) {
        return new Tea(waterCost, leavesCost, sugarCost, prices[0]);
    }
}
