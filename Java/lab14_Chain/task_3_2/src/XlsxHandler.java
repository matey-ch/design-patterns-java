public class XlsxHandler extends FileHandler {

    private String ext = "xlsx";
    @Override
    void handle(String file) {
        int lastIndexDot = file.lastIndexOf('.');
        if (lastIndexDot!= -1) {
            String extension = file.substring(lastIndexDot + 1);
            if (ext.equals(extension)) {
                System.out.println("Opened "+file+" as "+ext+" file");
                return;
            }
        }
        System.out.println(file+" is not "+ext+" file");
        next.handle(file);
    }
}
