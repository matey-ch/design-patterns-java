public abstract class BeverageMaker {
    private double grainsCost;
    private double milkCost;
    private double waterCost;
    private double sugarCost;
    private double[] prices;


    public BeverageMaker() {
    }

    abstract protected Beverage makeBeverage(double waterCost, double grainsCost, double sugarCost, double milkCost, double[] prices);

    public double serveBeverage(char size, double sugarAmount){
        Beverage beverage = makeBeverage(waterCost, grainsCost, sugarCost, milkCost, prices);
        return beverage.calculate_profit(size, sugarAmount);
    }


    public void setWaterCost(double waterCost){
        this.waterCost=waterCost;
    }

    public void setGrainsCost(double grainsCost){
        this.grainsCost=grainsCost;
    }

    public void setMilkCost(double milkCost){
        this.milkCost=milkCost;
    }

    public void setSugarCost(double sugarCost){
        this.sugarCost=sugarCost;
    }

    public void setPrices(double[] prices){
        this.prices=prices;
    }

}
