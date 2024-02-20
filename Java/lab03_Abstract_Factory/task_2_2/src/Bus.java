public abstract class Bus implements Transport {
    protected Bus(int cost, int usageCost) {
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

    public void goByWay() {
        System.out.println("Bus runs!");
    }

    protected final int cost;       // Вартість одиниці транспорту
    protected final int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу

}
