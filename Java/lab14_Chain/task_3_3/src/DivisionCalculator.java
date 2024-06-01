public class DivisionCalculator extends Calculator {
    @Override
    double calculate(double a, double b, Operation operation) {
        if (operation==Operation.Division) return a/b;
        return next.calculate(a,b,operation);
    }
}
