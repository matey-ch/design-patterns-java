import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaffList implements Iterable<Employee> {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new StaffListIterator(this);
    }
}
