public class Main {

    public static void main(String[] args) {

        Beverage espresso = new Sugar(
                new Sugar(
                        new Espresso()
                )
        );
        System.out.println(espresso);

        Beverage darkRoast = new SourCream(
                new Sugar(new Sugar(
                        new DarkRoast()
                ))
        );
        System.out.println(darkRoast);

        Beverage darkRoast2 = new Cream(
                new Sugar(
                        new DarkRoast()
                )
        );
        System.out.println(darkRoast2);

        Beverage decaf = new Milk(
                new Sugar( new Sugar(
                        new Decaf()
                ))
        );
        System.out.println(decaf);
    }
}
