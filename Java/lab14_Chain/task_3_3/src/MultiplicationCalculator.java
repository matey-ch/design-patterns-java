public class MultiplicationCalculator extends Calculator {
    @Override
    double calculate(double a, double b, Operation operation) {
        if (operation==Operation.Multiplication) return a*b;
        return next.calculate(a,b,operation);
    }
}
