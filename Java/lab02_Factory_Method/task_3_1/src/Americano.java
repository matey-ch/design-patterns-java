public class Americano extends Beverage {

    private double[] prices;

    private static double waterAmount = 0.5;
    private static double grainsAmount = 0.4;
    private static double[] multipliers = new double[]{0.75,1,1.5};

    public Americano(double waterCost, double grainsCost, double sugarCost, double[] prices){
        this.waterCost =waterCost;
        this.grainsCost = grainsCost;
        this.sugarCost =sugarCost;
        this.prices = prices;
    }

    @Override
    public double calculate_profit(char size, double sugarAmount) {
        int index = switch (size){
            case 'S' -> 0;
            case 'M' -> 1;
            case 'L' -> 2;
            default -> {
                System.out.println("Not valid size. Treating as 'M'.");
                yield 1;
            }
        };

        return -(waterAmount * waterCost + grainsAmount * grainsCost)*multipliers[index] -  sugarCost *sugarAmount + prices[index];
    }

}
