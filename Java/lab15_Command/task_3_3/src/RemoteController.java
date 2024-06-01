public class RemoteController {

    private Command commandOn;
    private Command commandOff;
    private Command commandUp;
    private Command commandDown;
    private Command commandNext;
    private Command commandPrev;

    public void setCommandOn(Command commandOn) {
        this.commandOn = commandOn;
    }
    public void setCommandOff(Command commandOff) {
        this.commandOff = commandOff;
    }
    public void setCommandUp(Command commandUp) {
        this.commandUp = commandUp;
    }
    public void setCommandDown(Command commandDown) {
        this.commandDown = commandDown;
    }
    public void setCommandNext(Command commandNext) {
        this.commandNext = commandNext;
    }
    public void setCommandPrev(Command commandPrev) {
        this.commandPrev = commandPrev;
    }
    void deviceOn(){
        if (commandOn != null)
            commandOn.execute();
    }
    void deviceOff(){
        if (commandOff != null)
            commandOff.execute();
    }
    void deviceVolumeUp(){
        if (commandUp != null)
            commandUp.execute();
    }
    void deviceVolumeDown(){
        if (commandDown != null)
            commandDown.execute();
    }
    void deviceNextChanel(){
        if (commandNext != null)
            commandNext.execute();
    }
    void devicePrevChanel(){
        if (commandPrev != null)
            commandPrev.execute();
    }
}
