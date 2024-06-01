public class Client {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        Calculator c1 = new AdditionCalculator();
        Calculator c2 = new SubtractionCalculator();
        Calculator c3 = new MultiplicationCalculator();
        Calculator c4 = new DivisionCalculator();
        Calculator c5 = new RemainderCalculator();

        calculator.setNext(c1);
        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);
        c4.setNext(c5);

        System.out.println(calculator.calculate(3,5, Calculator.Operation.Addition));
        System.out.println(calculator.calculate(3,5, Calculator.Operation.Subtraction));
        System.out.println(calculator.calculate(3,5, Calculator.Operation.Multiplication));
        System.out.println(calculator.calculate(3,5, Calculator.Operation.Division));
        System.out.println(calculator.calculate(3,5, Calculator.Operation.Remainder));

    }
}
