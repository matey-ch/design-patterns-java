public class Main {

    public static void main(String[] args) {
        FileReader fileReader1 = new FileReader("resources/input01.txt");
        FileReader fileReader2 = new FileReader("resources/input02.txt");

        ReaderSubscriber readerSubscriber = new ReaderSubscriber();
        ReaderSubscriber readerSubscriber2 = new ReaderSubscriber();

        fileReader1.subscribe(readerSubscriber);
        fileReader2.subscribe(readerSubscriber);


        fileReader1.read();


        fileReader2.subscribe(readerSubscriber2);
        fileReader2.read();


        readerSubscriber.getInfo(fileReader1);
        readerSubscriber.getInfo(fileReader2);
        readerSubscriber2.getInfo(fileReader1);
        readerSubscriber2.getInfo(fileReader2);
    }

}
