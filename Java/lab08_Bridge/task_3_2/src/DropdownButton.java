public class DropdownButton extends Button {

  public DropdownButton (ButtonSize buttonSize){
    super(buttonSize);
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Drawing a dropdown button.\n");
  }

}
