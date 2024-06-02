import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {

    private final List<Employee> employees;
    private int iterationState;

    public StaffListIterator(StaffList staffList) {
        this.employees = staffList.getEmployees();
        this.employees.sort(Comparator.comparing(Employee::getName));
        iterationState = 0;
    }

    @Override
    public boolean hasNext() {
        return iterationState < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(iterationState++);
    }
}
