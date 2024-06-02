public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pen", 175);
    ShopItem pencils = new ShopItem("pencil", 0);
    ShopItem paper = new ShopItem("paper", 500);
    ShopItem it = new ShopItem("it", 100);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);
    shop.putItem(it);

    for (ShopItem item : shop){
      System.out.println(item);
    }

    System.out.println("\nSorting by name");
    shop.setSorting(1);
    for (ShopItem item : shop){
      System.out.println(item);
    }

    System.out.println("\nSorting by quantity");
    shop.setSorting(2);
    for (ShopItem item : shop){
      System.out.println(item);
    }


  }

}
