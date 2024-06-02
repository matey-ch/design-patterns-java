import java.util.Stack;

public class Caretaker {

    private final Triangle triangle;
    private final Stack<Memento> history = new Stack<>();

    public Caretaker(Triangle triangle) {
        this.triangle = triangle;
    }

    public void setA(float a) {
        final Memento memento = triangle.save();
        history.push(memento);
        triangle.setA(a);
    }

    public void setB(float b) {
        final Memento memento = triangle.save();
        history.push(memento);
        triangle.setB(b);
    }

    public void setC(float c) {
        final Memento memento = triangle.save();
        history.push(memento);
        triangle.setC(c);
    }


    public void undo(){
        if (history.empty()){
            return;
        }

        final Memento memento = history.pop();
        triangle.restore(memento);
    }

}