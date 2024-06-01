public class AdditionCalculator extends Calculator {
    @Override
    double calculate(double a, double b, Operation operation) {
        if (operation==Operation.Addition) return a+b;
        return next.calculate(a,b,operation);
    }
}
