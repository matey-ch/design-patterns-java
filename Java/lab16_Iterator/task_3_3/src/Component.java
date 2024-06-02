import java.util.List;

public interface Component {
    void execute();

    int getPrice();

    List<Component> getChildren();
}