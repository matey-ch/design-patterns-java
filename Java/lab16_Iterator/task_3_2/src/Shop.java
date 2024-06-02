import java.util.HashMap;
import java.util.Iterator;

public class Shop implements Iterable<ShopItem> {

    private final HashMap<String, ShopItem> items = new HashMap<>();
    private int sorting = 0;

    public void setSorting(int sorting){
        this.sorting = sorting;
    }

    void putItem(ShopItem item){
        items.put(item.getName(), item);
    }

    public HashMap<String, ShopItem> getItems() {
        return items;
    }

    @Override
    public Iterator<ShopItem> iterator() {
        if (this.sorting==1) return new ShopIteratorName(this);
        else if (this.sorting==2) return new ShopIteratorQuantity(this);
        else return new ShopIterator(this);
    }
}
