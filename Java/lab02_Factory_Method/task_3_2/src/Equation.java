import java.util.ArrayList;
import java.util.Arrays;

public class Equation {
    private double b;
    private double c;

    public Equation(double b, double c){
        this.b=b;
        this.c=c;
    }

    public ArrayList<Double> solve(){
        if (b==0){
            if (c==0){
                return new ArrayList<>(Arrays.asList(Double.POSITIVE_INFINITY));
            }
            return new ArrayList<>();
        }


        return new ArrayList<>(Arrays.asList(-c/b));
    }

    @Override
    public String toString() {
        return (""+this.b+" "+this.c);
    }

}
