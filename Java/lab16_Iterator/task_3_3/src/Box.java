import java.util.*;

public class Box implements Component, Iterable<Component> {
    private final List<Component> children = new ArrayList<>();
    private int search = 0;
    private final int price;

    public Box(int price) {
        this.price = price;
    }

    public void add(Component child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return "Box{" +
                ", value=" + price +
                '}';
    }

    @Override
    public void execute() {
        System.out.println(this);
        for (Component child : children) {
            child.execute();
        }
    }

    @Override
    public Iterator<Component> iterator() {
        switch (search) {
            case 0: // Depth-first search
                return new DFSIterator(this);
            case 1: // Breadth-first search
                return new BFSIterator(this);
            default:
                throw new IllegalArgumentException("Invalid search mode");
        }
    }

    public void setSearch(int search) {
        this.search = search;
    }

    @Override
    public int getPrice(){
        return this.price;
    }

    @Override
    public List<Component> getChildren() {
        return children;
    }
}