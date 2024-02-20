import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TransportFactory volvoFactory = new VolvoFactory();
        TransportFactory skodaFactory = new SkodaFactory();

        ArrayList<Transport> volvoTransports = new ArrayList<>();
        ArrayList<Transport> skodaTransports = new ArrayList<>();

//        ArrayList<Bus> buses = new ArrayList<>();
//        ArrayList<Tram> trams = new ArrayList<>();
//        ArrayList<Trolleybus> trolleybuses = new ArrayList<>();

        final int A = 10;       // закупити A автобусів
        final int T = 5;        // закупити T трамваїв
        final int Tr = 40;      // закупити Tr – тролейбусів
        final int N = 200_000;  // орієнтований пробіг експлуатації

        for (int i = 0; i < A; i++) {
            Bus volvoBus = volvoFactory.createBus();
            volvoTransports.add(volvoBus);
            volvoBus.goByWay();
            Bus skodaBus = skodaFactory.createBus();
            skodaTransports.add(skodaBus);
            skodaBus.goByWay();
        }

        for (int i = 0; i < T; i++) {
            Tram volvoTram = volvoFactory.createTram();
            volvoTransports.add(volvoTram);
            volvoTram.goByRails();
            Tram skodaTram = skodaFactory.createTram();
            skodaTransports.add(skodaTram);
            skodaTram.goByRails();
        }

        for (int i = 0; i < Tr; i++) {
            Trolleybus volvoTrolleybus = volvoFactory.createTrolleybus();
            volvoTransports.add(volvoTrolleybus);
            volvoTrolleybus.goByContactNetwork();
            Trolleybus skodaTrolleybus = skodaFactory.createTrolleybus();
            skodaTransports.add(skodaTrolleybus);
            skodaTrolleybus.goByContactNetwork();
        }


        int finalVolvoCost = 0;
        for (Transport transport : volvoTransports) {
            finalVolvoCost += transport.getTotalCost(N);
        }

        int finalSkodaCost = 0;
        for (Transport transport : skodaTransports) {
            finalSkodaCost += transport.getTotalCost(N);
        }


        System.out.println("finalVolvoCost = " + finalVolvoCost);
        System.out.println("finalSkodaCost = " + finalSkodaCost);
    }
}
