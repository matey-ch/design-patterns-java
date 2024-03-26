public class PostSpaceDecorator extends PrintableDecorator{

    public PostSpaceDecorator(Printable wrappee){
        super(wrappee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }

}
