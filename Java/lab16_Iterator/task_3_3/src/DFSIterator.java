import java.util.Iterator;
import java.util.Stack;

public class DFSIterator implements Iterator<Component> {
    private final Stack<Component> stack = new Stack<>();

    public DFSIterator(Box root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return!stack.isEmpty();
    }

    @Override
    public Component next() {
        Component current = stack.pop();
        System.out.println(current);
        for (Component child : current.getChildren()) {
            stack.push(child);
        }
        return current;
    }
}