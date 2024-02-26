import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("ab")
                .insert("fgh",2);

        ArrayList<Character> arr = new ArrayList<>(Arrays.asList('c','d','e'));
        LinkedList<Character> arr1 = new LinkedList<>(Arrays.asList('0','1','2'));
        ArrayList<Integer> arr2 =  new ArrayList<>(Arrays.asList(5,6,7));
        //list of integers is perceived as just an object, so object's string representation is added

        sb.insert(arr,0)
                .append(arr1)
                .append(arr2);

        String string = sb.toString();
        System.out.println(string);
    }
}
