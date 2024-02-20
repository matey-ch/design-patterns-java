public class VolvoFactory implements TransportFactory {

    @Override
    public Tram createTram() {
        return new VolvoTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new VolvoTrolleybus();
    }

    @Override
    public Bus createBus() {
        return new VolvoBus();
    }
}
