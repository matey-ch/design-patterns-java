public class HyundaiFactory implements TransportFactory {

    @Override
    public Tram createTram() {
        return new HyundaiTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new HyundaiTrolleybus();
    }

    @Override
    public Bus createBus() {
        return new HyundaiBus();
    }
}
