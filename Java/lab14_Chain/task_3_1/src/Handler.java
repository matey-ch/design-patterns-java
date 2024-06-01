public abstract class Handler {
    protected Handler next = null;
    void setNext(Handler handler){
        next = handler;
    }

    abstract void handle(Account account);
}