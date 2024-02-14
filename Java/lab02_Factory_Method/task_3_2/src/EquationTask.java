import java.util.ArrayList;

public class EquationTask {

    private ArrayList<Equation> equations_zero = new ArrayList<>();
    private ArrayList<Equation> equations_one = new ArrayList<>();
    private ArrayList<Equation> equations_two = new ArrayList<>();
    private ArrayList<Equation> equations_three = new ArrayList<>();
    private ArrayList<Equation> equations_four = new ArrayList<>();
    private ArrayList<Equation> equations_inf = new ArrayList<>();

    private Equation max_one_equation=null;
    private Equation min_one_equation=null;

    private double max_one_sol = Double.NEGATIVE_INFINITY;
    private double min_one_sol = Double.POSITIVE_INFINITY;

    public EquationTask(){
    }

    protected Equation build_equation(double[] coeffs){
        return new Equation(coeffs[0], coeffs[1]);
    }

    public void add_equation(double[] coeffs){
        Equation eq = build_equation(coeffs);
        ArrayList<Double> sols =  eq.solve();
//        System.out.println(eq+" "+sols);

        if (sols.size()==1){
            if (sols.get(0)==Double.POSITIVE_INFINITY) {
                equations_inf.add(eq);
                return;
            }
            equations_one.add(eq);
            if (sols.get(0)>max_one_sol){
                max_one_sol=sols.get(0);
                max_one_equation=eq;
            }
            if (sols.get(0)<min_one_sol){
                min_one_sol=sols.get(0);
                min_one_equation=eq;
            }
        }
        else if (sols.size()==0) equations_zero.add(eq);
        else if (sols.size()==2) equations_two.add(eq);
        else if (sols.size()==3) equations_three.add(eq);
        else if (sols.size()==4) equations_four.add(eq);
        else System.out.println("What?"+eq+" "+sols);
    }

    public void union (EquationTask et){
        equations_zero.addAll(et.equations_zero);
        equations_one.addAll(et.equations_one);
        equations_two.addAll(et.equations_two);
        equations_three.addAll(et.equations_three);
        equations_four.addAll(et.equations_four);
        equations_inf.addAll(et.equations_inf);
        if (et.min_one_sol<min_one_sol){
            min_one_sol=et.min_one_sol;
            min_one_equation = et.min_one_equation;
        }
        if (et.max_one_sol>max_one_sol){
            max_one_sol=et.max_one_sol;
            max_one_equation = et.max_one_equation;
        }
    }

    public void print_results(){
        System.out.println("Zero solutions:");
        System.out.println(equations_zero+"\n");
        System.out.println("One solution:");
        System.out.println(equations_one+"\n");
        System.out.println("Two solutions:");
        System.out.println(equations_two+"\n");
        System.out.println("Three solutions:");
        System.out.println(equations_three+"\n");
        System.out.println("Four solutions:");
        System.out.println(equations_four+"\n");
        System.out.println("Infinite number of solution:");
        System.out.println(equations_inf+"\n");
        System.out.println("Min only solution:");
        System.out.println(min_one_equation+", x="+min_one_sol);
        System.out.println("Max only solution:");
        System.out.println(max_one_equation+", x="+max_one_sol);
    }
}