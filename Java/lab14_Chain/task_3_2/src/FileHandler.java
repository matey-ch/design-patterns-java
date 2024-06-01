public abstract class FileHandler {
    protected FileHandler next = null;
    void setNext(FileHandler handler){
        next = handler;
    }

    abstract void handle(String file);
}
