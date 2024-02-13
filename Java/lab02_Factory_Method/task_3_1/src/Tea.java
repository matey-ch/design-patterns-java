public class Tea extends Beverage {

    private double price;
    private double leavesCost;
    private static double leavesAmount = 0.5;
    private static double waterAmount = 0.4;

    public Tea(double waterCost, double leavesCost, double sugarCost, double price){
        this.waterCost =waterCost;
        this.leavesCost = leavesCost;
        this.sugarCost =sugarCost;
        this.price = price;
    }

    @Override
    public double calculate_profit(char size, double sugarAmount) {
        return -(waterAmount * waterCost + leavesAmount * leavesCost) -  sugarCost *sugarAmount + price;
    }
}
