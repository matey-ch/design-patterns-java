public class SubtractionCalculator extends Calculator {
    @Override
    double calculate(double a, double b, Operation operation) {
        if (operation==Operation.Subtraction) return a-b;
        return next.calculate(a,b,operation);
    }
}
