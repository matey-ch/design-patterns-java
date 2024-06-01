public class RemainderCalculator extends Calculator {
    @Override
    double calculate(double a, double b, Operation operation) {
        if (operation==Operation.Remainder) return a%b;
        return next.calculate(a,b,operation);
    }
}
