import java.util.ArrayList;
import java.util.List;

public class Item implements Component {

    private final String name;
    private final int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + price +
                '}';
    }

    @Override
    public int getPrice(){
        return this.price;
    }

    @Override
    public void execute() {
        System.out.println(this);
    }

    @Override
    public List<Component> getChildren() {
        return new ArrayList<>();
    }
}
