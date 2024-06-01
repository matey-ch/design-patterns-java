public class FinalHandler extends FileHandler {

    @Override
    void handle(String file) {
        System.out.println("Could not open "+file);
    }
}
