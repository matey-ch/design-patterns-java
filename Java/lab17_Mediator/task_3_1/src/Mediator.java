public interface Mediator {
    void broadcast(Component componentFrom,
                   Message message);
}