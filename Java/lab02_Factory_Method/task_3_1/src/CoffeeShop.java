public class CoffeeShop {
    public static void main(String[] args) {
        BeverageMaker[] makers = new BeverageMaker[5];
        makers[0] = new EspressoMaker();
        makers[1] = new AmericanoMaker();
        makers[2] = new LatteMaker();
        makers[3] = new CappuccinoMaker();
        makers[4] = new EspressoMaker();

        for (int i = 0; i < makers.length; i++) {
            makers[i].setSugarCost(1);
            makers[i].setWaterCost(2);
        }

        makers[4].setWaterCost(1);
        makers[2].setMilkCost(3);

        makers[0].setGrainsCost(10);
        makers[1].setGrainsCost(12);
        makers[2].setGrainsCost(11);
        makers[3].setGrainsCost(9);
        makers[4].setGrainsCost(10);

        makers[0].setPrices(new double[]{5,7,9});
        makers[1].setPrices(new double[]{6,8,10});
        makers[2].setPrices(new double[]{6,8});
        makers[3].setPrices(new double[]{8});
        makers[4].setPrices(new double[]{6,8,10});

        double total_profits = 0;

        for (int i=0; i<100; i++){
            int makerNum = (int)(Math.random()*5);
            char size = switch((int)(Math.random()*3)){
                case 0->'S';
                case 1->'M';
                case 2->'L';
                default -> 'E';
            };
            double sugar = Math.random()*3;
            double profit = makers[makerNum].serveBeverage(size, sugar);
            System.out.println(""+makerNum+" "+size+" "+sugar+" "+profit);
            total_profits+=profit;
        }

        System.out.println("TOTAL PROFITS: "+total_profits);



    }
}
