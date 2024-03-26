public class PrintableDecorator implements Printable {

    final private Printable wrappee;

    public PrintableDecorator(Printable wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void print() {
        wrappee.print();
    }
}
