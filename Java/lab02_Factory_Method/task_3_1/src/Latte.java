public class Latte extends Beverage {

    private double milkCost;
    private double[] prices;

    private static double waterAmount = 0.2;
    private static double grainsAmount = 0.4;
    private static double milkAmount = 0.3;

    private static double[] multipliers = new double[]{1,1.25};

    public Latte(double waterCost, double grainsCost, double sugarCost, double milkCost, double[] prices){
        this.waterCost =waterCost;
        this.grainsCost = grainsCost;
        this.sugarCost =sugarCost;
        this.milkCost = milkCost;
        this.prices = prices;
    }

    @Override
    public double calculate_profit(char size, double sugarAmount) {
        int index = switch (size){
            case 'M' -> 0;
            case 'L' -> 1;
            default -> {
                System.out.println("Not valid size. Treating as 'M'.");
                yield 0;
            }
        };

        return -(waterAmount * waterCost + grainsAmount * grainsCost + milkCost*milkAmount)*multipliers[index] - sugarCost * sugarAmount + prices[index];
    }

}
