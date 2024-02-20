public class SkodaFactory implements TransportFactory {

    @Override
    public Tram createTram() {
        return new SkodaTram();
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new SkodaTrolleybus();
    }

    @Override
    public Bus createBus() {
        return new SkodaBus();
    }
}
