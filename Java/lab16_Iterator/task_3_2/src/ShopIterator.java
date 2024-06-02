import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopIterator implements Iterator<ShopItem> {

    protected final List<ShopItem> items;
    private int iterationState;

    public ShopIterator(Shop shop) {
        this.items = new ArrayList<>(shop.getItems().values());
        iterationState = 0;
    }

    @Override
    public boolean hasNext() {
        return iterationState < items.size();
    }

    @Override
    public ShopItem next() {
        return items.get(iterationState++);
    }
}
