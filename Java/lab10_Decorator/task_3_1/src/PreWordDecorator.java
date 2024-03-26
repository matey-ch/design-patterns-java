public class PreWordDecorator extends PrintableDecorator{

    private String word;

    public PreWordDecorator(Printable wrappee, String word){
        super(wrappee);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }

}
