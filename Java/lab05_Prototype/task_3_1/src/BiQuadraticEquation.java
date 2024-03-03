import java.util.ArrayList;

public class BiQuadraticEquation extends Equation {
    private final double a,b,c;
    public BiQuadraticEquation(double a, double b, double c) {
        super(0,0);
        this.a=a;
        this.b=b;
        this.c=c;
    }

    private BiQuadraticEquation (BiQuadraticEquation other){
        this(other.a,other.b,other.c);
    }

    @Override
    public ArrayList<Double> solve(){
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        ArrayList<Double> squared = qe.solve();
        ArrayList<Double> ans = new ArrayList<>();

        for (int i = 0; i < squared.size(); i++) {
            if (squared.get(i)==Double.POSITIVE_INFINITY) ans.add(Double.POSITIVE_INFINITY);
            else if (squared.get(i)==0) ans.add(0.0);
            else if (squared.get(i)>0){
                ans.add(Math.sqrt(squared.get(i)));
                ans.add(-Math.sqrt(squared.get(i)));
            }
        }

        return ans;
    }

    @Override
    public String toString() {
        return (""+this.a+" 0 "+this.b+" 0 "+this.c);
    }

    @Override
    public BiQuadraticEquation clone(){
        return new BiQuadraticEquation(this);
    }
}
