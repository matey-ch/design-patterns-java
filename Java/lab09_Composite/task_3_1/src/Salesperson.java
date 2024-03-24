public class Salesperson extends Employee{

  private final Manager manager;

  public Salesperson(String name, int salary, Manager manager) {
    super(name,salary);
    this.manager = manager;
  }

}
