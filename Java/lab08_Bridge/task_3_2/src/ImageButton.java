public class ImageButton extends Button{

    public ImageButton (ButtonSize buttonSize){
        super(buttonSize);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing an image button.\n");
    }
}
