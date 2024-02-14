public class QuadraticEquationTask extends EquationTask {
    @Override
    protected Equation build_equation(double[] coeffs){
        return new QuadraticEquation(coeffs[0], coeffs[1], coeffs[2]);
    }
}
