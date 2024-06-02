import java.util.ArrayList;
import java.util.List;

public class AirTrafficMediator implements Mediator {
    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void broadcast(Component componentFrom, Message message) {
        System.out.println(componentFrom+" sent a message "+message.getContents()+" about plane "+message.getPlane());
        for (Component component : components) {
            component.handleMessage(componentFrom, message);
        }
    }
}
