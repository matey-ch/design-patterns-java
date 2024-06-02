/**
 * Злітно-посадкова смуга
 */
public class Runway extends Component {
  /**
   * Чи вільна смуга
   */
  private boolean isAvailable = true;


  public void handleMessage(Component componentFrom, Message message) {
    String contents = message.getContents();
    if (contents.equals("ClearRunway")){
      this.isAvailable = true;
      System.out.println("Runway is clear");
      return;
    }
    if (contents.equals("IsRunwayAvailable")){
      if (this.isAvailable){
        this.isAvailable = false;
        broadcastMessage(new Message("RunwayFree", message.getPlane()));
      }
      else {
        broadcastMessage(new Message("RunwayBusy", message.getPlane()));
      }
      return;
    }
  }

}
