public abstract class Tram implements Transport {
    protected Tram(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public int getTotalCost(int km) {
        return cost+usageCost*km;
    }


    public void goByRails() {
        System.out.println("Tram runs!");
    }

    protected final int cost;       // Вартість одиниці транспорту
    protected final int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу

}
