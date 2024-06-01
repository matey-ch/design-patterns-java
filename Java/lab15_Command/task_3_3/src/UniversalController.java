import java.util.ArrayList;
import java.util.List;

public class UniversalController{

    private List<Command> commandsOff = new ArrayList<>();


    public void addCommandOff(Command commandOff) {
        this.commandsOff.add(commandOff);
    }

    public void off() {
        for (Command command : commandsOff) {
            command.execute();
        }
    }
}
