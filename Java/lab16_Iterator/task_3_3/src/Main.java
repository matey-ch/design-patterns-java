import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        final Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {

                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                final Item item = new Item(name, value);
                box.add(item);
            }
        }

        root.execute();


        System.out.println("\nDoing BFS");
        root.setSearch(1);
        int cheapestPrice = Integer.MAX_VALUE;
        Component cheapestComponent = null;
        for (Component component : root) {
            System.out.println(component);
            if (component.getPrice()<cheapestPrice){
                cheapestPrice = component.getPrice();
                cheapestComponent = component;
            }
        }
        System.out.println("\nCheapest: "+cheapestComponent);

        System.out.println("\nDoing DFS");
        root.setSearch(0);
        int biggestPrice = Integer.MIN_VALUE;
        Component biggestComponent = null;
        for (Component component : root) {
            System.out.println(component);
            if (component.getPrice()>biggestPrice){
                biggestPrice = component.getPrice();
                biggestComponent = component;
            }
        }
        System.out.println("\nMost expensive: "+biggestComponent);

    }
}
