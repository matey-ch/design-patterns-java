import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Paid {

    private final List<Paid> paids= new ArrayList<>();

    void addPaid(Paid paid) {
        paids.add(paid);
    }

    @Override
    public void payExpenses() {
        for (Paid paid : paids) {
            paid.payExpenses();
        }
    }

}
