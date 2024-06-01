public class BasicCalculator extends Calculator {
    @Override
    double calculate(double a, double b, Operation operation) {
        return next.calculate(a,b,operation);
    }
}
