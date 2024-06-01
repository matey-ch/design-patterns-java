public class PreviousChannelCommand implements Command {
    private final Device device;

    public PreviousChannelCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.prevChanel();
    }
}