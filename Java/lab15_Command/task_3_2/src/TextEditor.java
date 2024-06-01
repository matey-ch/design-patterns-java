public class TextEditor {

    private Document document;

    final private Button saveButton;
    final private Button printButton;

    final private MenuItem saveMenuItem;
    final private MenuItem printMenuItem;
    final private MenuItem showInfoMenuItem;

    final private Shortcut saveShortcut;
    final private Shortcut printShortcut;

    final private Command saveCommand;
    final private Command printCommand;
    final private Command showInfoCommand;

    public TextEditor() {
        saveCommand = new SaveCommand();
        showInfoCommand = new ShowInfoCommand();
        printCommand = new PrintCommand();

        saveButton = new Button(saveCommand);
        printButton = new Button(printCommand);

        saveMenuItem = new MenuItem(saveCommand);
        printMenuItem = new MenuItem(printCommand);
        showInfoMenuItem = new MenuItem(showInfoCommand);

        saveShortcut = new Shortcut(saveCommand);
        printShortcut = new Shortcut(printCommand);
    }

    public void newDocument(String name) {
        document = new Document(name);
        saveCommand.setDocument(document);
        printCommand.setDocument(document);
        showInfoCommand.setDocument(document);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select();
    }

    public void selectPrintMenuItem() {
        printMenuItem.select();
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select();
    }

    public void pressSaveShortcut() {
        saveShortcut.press();
    }

    public void pressPrintShortcut() {
        printShortcut.press();
    }
}
