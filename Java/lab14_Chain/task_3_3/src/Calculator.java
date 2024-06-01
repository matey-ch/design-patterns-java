public abstract class Calculator {

    public enum Operation{
        Addition,
        Subtraction,
        Multiplication,
        Division,
        Remainder
    }

    protected Calculator next = null;
    void setNext(Calculator handler){
        next = handler;
    }
    abstract double calculate(double a, double b, Operation operation);
}