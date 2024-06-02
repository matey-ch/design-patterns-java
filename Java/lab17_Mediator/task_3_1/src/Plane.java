/**
 * Літак
 */
public class Plane extends Component {

  /**
   * Чи злетів літак
   */
  private boolean isInTheAir;

  /**
   * Ідентифікатор літака
   */
  private int id;



  public Plane(int id) {
    this.id = id;
    isInTheAir = false;
  }

  /**
   * Зліт літака
   */
  public void takeOff() {
    if(!isInTheAir) {
      broadcastMessage(new Message("IsRunwayAvailable", this));
    }
  }

  public void land() {
    if(isInTheAir) {
      broadcastMessage(new Message("IsRunwayAvailable", this));
    }
  }

  /**
   * Ідентифікатор літака
   * @return ідентифікатор
   */
  public int getId() {
    return id;
  }



  @Override

  public void handleMessage(Component componentFrom, Message message) {
    String contents = message.getContents();
    if (contents.equals("RunwayFree")){
      if (message.getPlane().getId() != this.id) return;
      if (!this.isInTheAir) {
        System.out.println("Plane " + id + " is taking off...");
        broadcastMessage(new Message("PlaneUp", this));
        broadcastMessage(new Message("ClearRunway"));
      }
      else {
        System.out.println("Plane " + id + " is landing...");
        broadcastMessage(new Message("PlaneDown", this));
        broadcastMessage(new Message("ClearRunway"));
      }
      return;
    }
    if (contents.equals("RunwayBusy")){
      if (message.getPlane().getId() != this.id) return;
      System.out.println("Plane "+id+" couldn't land or take off");
      return;
    }
  }
}
