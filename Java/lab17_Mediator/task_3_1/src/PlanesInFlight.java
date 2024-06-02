import java.util.ArrayList;

/**
 * Літаки у повітрі
 */
public class PlanesInFlight extends Component {

  /**
   * Список літаків
   */
  ArrayList<Plane> planes = new ArrayList<>();

  /**
   * Додати літак
   * @param plane літак
   */
  public void addPlane(Plane plane) {
    planes.add(plane);
  }

  /**
   * Видалити літак зі списку
   * @param plane літак
   */
  public void removePlane(Plane plane) {
    planes.remove(plane);
  }

  @Override
  public void handleMessage(Component componentFrom, Message message) {
    String contents = message.getContents();
    if (contents.equals("PlaneUp")){
      Plane plane = message.getPlane();
      this.addPlane(plane);
      System.out.println("New plane in the air");
      return;
    }
    if (contents.equals("PlaneDown")){
      Plane plane = message.getPlane();
      System.out.println("Minus one plane in the air");
      this.removePlane(plane);
      return;
    }
  }
}
