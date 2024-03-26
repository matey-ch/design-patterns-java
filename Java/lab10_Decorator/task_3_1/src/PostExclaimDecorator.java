public class PostExclaimDecorator extends PrintableDecorator{

    public PostExclaimDecorator(Printable wrappee){
        super(wrappee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }

}
