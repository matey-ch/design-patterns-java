import java.util.ArrayList;

/**
 * Літаки, що приземлилися
 */
public class PlanesOnGround extends Component {

  ArrayList<Plane> planes = new ArrayList<>();

  public void addPlane(Plane plane) {
    planes.add(plane);
  }

  public void removePlane(Plane plane) {
    planes.remove(plane);
  }

  public void handleMessage(Component componentFrom, Message message) {
    String contents = message.getContents();
    if (contents.equals("PlaneUp")){
      Plane plane = message.getPlane();
      this.removePlane(plane);
      System.out.println("Minus one plane on the ground");
      return;
    }
    if (contents.equals("PlaneDown")){
      Plane plane = message.getPlane();
      System.out.println("New plane on the ground");
      this.addPlane(plane);
      return;
    }
  }

}
