import java.util.ArrayList;
import java.util.Arrays;

public class QuadraticEquation extends Equation {
    private final double a,b,c;
    public QuadraticEquation(double a, double b, double c) {
        super(b,c);
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public ArrayList<Double> solve(){
        if (a==0) return super.solve();

        double d = b*b-4*a*c;
        if (d<0) return new ArrayList<>();

        if (d==0) return new ArrayList<>(Arrays.asList(-b/(2*a)));
        return new ArrayList<>(Arrays.asList((-b+Math.sqrt(d))/(2*a),(-b-Math.sqrt(d))/(2*a)));
    }

    @Override
    public String toString() {
        return (""+this.a+" "+this.b+" "+this.c);
    }


}
