public class Main {

  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");

    StaffList staffList = new StaffList();
    staffList.addEmployee(zak);
    staffList.addEmployee(anna);
    staffList.addEmployee(sarah);

    for (Employee employee : staffList){
      System.out.println(employee);
    }

  }

}
