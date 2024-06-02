public class ShopIteratorQuantity extends ShopIterator {

    public ShopIteratorQuantity(Shop shop) {
        super(shop);
        items.sort((item1, item2) -> Integer.compare(item2.getQuantity(), item1.getQuantity()));
    }
}
