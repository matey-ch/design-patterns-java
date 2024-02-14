import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run_task("input01.txt");
        run_task("input02.txt");
        run_task("input03.txt");

    }
    public static void run_task(String filename) {
        System.out.println("Running task for "+filename+"\n");
        Scanner scanner;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        ArrayList<double[]> all_coeffs = new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] tokens = line.split("\\s+"); // Split the line by whitespace
            double[] coeffs = new double[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                try {
                    coeffs[i] = Double.parseDouble(tokens[i]);
                } catch (NumberFormatException e) {
                }
            }
//            System.out.println(Arrays.toString(coeffs));
            all_coeffs.add(coeffs);
        }

        EquationTask equationTask = new EquationTask();
        EquationTask quadraticEquationTask = new QuadraticEquationTask();
        EquationTask biQuadraticEquationTask = new BiQuadraticEquationTask();

        for (double[] coeffs: all_coeffs){
            if(coeffs.length==2){
                equationTask.add_equation(coeffs);
            }
            else if (coeffs.length==3){
                quadraticEquationTask.add_equation(coeffs);
            }
            else if (coeffs.length==5){
                biQuadraticEquationTask.add_equation(coeffs);
            }
            else System.out.println("what"+Arrays.toString(coeffs));
        }

        equationTask.union(quadraticEquationTask);
        equationTask.union(biQuadraticEquationTask);

        equationTask.print_results();
        System.out.println("-------------------\n");
    }
}
