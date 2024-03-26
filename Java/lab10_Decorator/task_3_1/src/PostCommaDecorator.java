public class PostCommaDecorator extends PrintableDecorator{

    public PostCommaDecorator(Printable wrappee){
        super(wrappee);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(",");
    }

}
