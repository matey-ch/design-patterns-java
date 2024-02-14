public class BiQuadraticEquationTask extends EquationTask {
    @Override
    protected Equation build_equation(double[] coeffs){
        return new BiQuadraticEquation(coeffs[0], coeffs[2], coeffs[4]);
    }
}
