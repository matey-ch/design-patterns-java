public class Cafe {

    public static void main(String[] args) {
        Beverage blackChocolate = new Chocolate(3, new BlackBeverage(200), new BeverageToGo());
        Beverage blackCoffee = new Coffee(3, new BlackBeverage(200), new BeverageForHere(),true);
        Beverage blackTea = new Tea(0, new BlackBeverage(300), new BeverageToGo());

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTea);

        Beverage milkChocolate = new Chocolate(3, new MilkBeverage(200), new BeverageForHere());
        Beverage coffeeWithMilk = new Coffee(3, new MilkBeverage(200),new BeverageToGo(), false);
        Beverage teaWithMilk = new Tea(2, new MilkBeverage(300), new BeverageForHere());

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teaWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
