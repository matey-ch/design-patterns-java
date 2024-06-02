import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSIterator implements Iterator<Component> {
    private final Queue<Component> queue = new LinkedList<>();

    public BFSIterator(Box root) {
        queue.offer(root);
    }

    @Override
    public boolean hasNext() {
        return!queue.isEmpty();
    }

    @Override
    public Component next() {
        Component current = queue.poll();
        System.out.println(current);
        for (Component child : current.getChildren()) {
            queue.offer(child);
        }
        return current;
    }
}