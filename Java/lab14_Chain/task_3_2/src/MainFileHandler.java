public class MainFileHandler extends FileHandler {
    @Override
    void handle(String file) {
        System.out.println("\nStarting handling "+file);
        next.handle(file);
    }
}
