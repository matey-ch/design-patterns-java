public class RadioButton extends Button {

  public RadioButton (ButtonSize buttonSize){
    super(buttonSize);
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Drawing a radio button.\n");
  }

}
