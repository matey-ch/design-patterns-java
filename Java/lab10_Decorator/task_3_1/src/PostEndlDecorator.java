public class PostEndlDecorator extends PrintableDecorator{

    public PostEndlDecorator(Printable wrappee){
        super(wrappee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\n");
    }

}
