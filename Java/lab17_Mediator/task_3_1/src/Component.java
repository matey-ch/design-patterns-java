abstract public class Component {
    public void broadcastMessage(Message message) {
        if (mediator != null) {
            mediator.broadcast(this, message);
        }
    }

    public abstract void handleMessage(Component componentFrom, Message message);

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

}