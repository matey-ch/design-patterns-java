public class Main {
    public static void main(String[] args) {
        Equation eq1 = new Equation(2,3);
        Equation eq2 = eq1.clone();
        System.out.println(eq1+"; "+eq2);

        eq1 = new QuadraticEquation(1, 2,3);
        eq2 = eq1.clone();
        System.out.println(eq1+"; "+eq2);


        eq1 = new BiQuadraticEquation(4, 2,3);
        eq2 = eq1.clone();
        System.out.println(eq1+"; "+eq2);
    }
}
