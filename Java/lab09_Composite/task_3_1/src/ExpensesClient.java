public class ExpensesClient {

  public static void main(String[] args) {

    SalesTeam meatTeam = new SalesTeam();
    Manager meatManager = new Manager("Meat manager", 100);
    meatTeam.addPaid(meatManager);
    meatTeam.addPaid(new Salesperson("Meat worker 1", 200, meatManager));
    meatTeam.addPaid(new Salesperson("Meat worker 2", 300, meatManager));
    meatTeam.addPaid(new Salesperson("Meat worker 3", 300, meatManager));


    SalesTeam diaryTeam = new SalesTeam();
    Manager diaryManager = new Manager("diary manager", 200);
    diaryTeam.addPaid(meatManager);
    diaryTeam.addPaid(new Salesperson("diary worker 1", 150, diaryManager));
    diaryTeam.addPaid(new Salesperson("diary worker 2", 175, diaryManager));
    diaryTeam.addPaid(new Salesperson("diary worker 3", 180, diaryManager));

    SalesTeam candyTeam = new SalesTeam();
    Manager candyManager = new Manager("candy manager", 250);
    candyTeam.addPaid(meatManager);
    candyTeam.addPaid(new Salesperson("candy worker 1", 100, candyManager));
    candyTeam.addPaid(new Salesperson("candy worker 2", 80, candyManager));
    candyTeam.addPaid(new Salesperson("candy worker 3", 160, candyManager));

    SalesTeam store = new SalesTeam();
    Manager boss = new Manager("MAIN BOSS", 1000);
    store.addPaid(boss);
    store.addPaid(meatTeam);
    store.addPaid(diaryTeam);
    store.addPaid(candyTeam);

    payManager(meatManager);
    payTeam(store);
  }

  private static void payManager(Manager manager) {
    System.out.println("Expenses have been requested");
    manager.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

  private static void paySalesperson(Salesperson salesperson) {
    System.out.println("Expenses have been requested");
    salesperson.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

  private static void payTeam(SalesTeam team) {
    System.out.println("Expenses have been requested");
    team.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

}
