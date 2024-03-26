public class PostWordDecorator extends PrintableDecorator{

    private String word;

    public PostWordDecorator(Printable wrappee, String word){
        super(wrappee);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }

}
