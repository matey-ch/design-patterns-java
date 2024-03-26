public class Main {

    public static void main(String[] args) {
        PrintableString empty = new PrintableString("");
        Printable hello = new PostEndlDecorator(
                new PostExclaimDecorator(
                        new PostWordDecorator(
                                new PreWordDecorator(
                                        new PostSpaceDecorator(new PostCommaDecorator(empty)),
                                        "Hello"
                                )
                                , "World"
                        )
                )
        );
        hello.print();
    }

}
