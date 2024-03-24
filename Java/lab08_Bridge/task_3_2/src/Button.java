public abstract class Button {

    protected ButtonSize buttonSize;

    public Button(ButtonSize buttonSize){
        this.buttonSize = buttonSize;
    }

    public void draw(){
        buttonSize.set();
    }

}
