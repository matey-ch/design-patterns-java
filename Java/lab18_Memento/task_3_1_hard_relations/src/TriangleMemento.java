public class TriangleMemento implements Memento {

    private final Triangle triangle;
    final private float a;
    final private float b;
    final private float c;

    public TriangleMemento(Triangle triangle, float a, float b, float c) {
        this.triangle = triangle;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void restore() {
        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);

    }
}