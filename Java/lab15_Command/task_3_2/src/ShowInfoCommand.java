public class ShowInfoCommand implements Command{
    protected Document document;
    public void setDocument(Document document) {
        this.document = document;
    }
    @Override
    public void execute() {
        document.showInfo();
    }
}
