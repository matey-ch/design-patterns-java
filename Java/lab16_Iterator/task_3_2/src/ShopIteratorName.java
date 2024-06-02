import java.util.Comparator;

public class ShopIteratorName extends ShopIterator {

    public ShopIteratorName(Shop shop) {
        super(shop);
        items.sort(Comparator.comparing(ShopItem::getName));
    }
}