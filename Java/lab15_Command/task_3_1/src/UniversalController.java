import java.util.ArrayList;
import java.util.List;

public class UniversalController extends Controller {

    private List<Command> commandsOn = new ArrayList<>();

    private List<Command> commandsOff = new ArrayList<>();

    @Override
    public void setCommandOn(Command commandOn) {
        this.commandsOn.add(commandOn);
    }

    @Override
    public void setCommandOff(Command commandOff) {
        this.commandsOff.add(commandOff);
    }

    @Override
    public void on() {
        for (Command command : commandsOn) {
            command.execute();
        }
    }
    @Override
    public void off() {
        for (Command command : commandsOff) {
            command.execute();
        }
    }
}