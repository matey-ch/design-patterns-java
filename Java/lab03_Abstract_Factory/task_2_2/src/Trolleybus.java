public abstract class Trolleybus implements Transport {
    protected Trolleybus(int cost, int usageCost) {
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


    public void goByContactNetwork() {
        System.out.println("Trolleybus runs");
    }

    protected final int cost;       // Вартість одиниці транспорту
    protected final int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу

}
