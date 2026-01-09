package Lectures.DesingPatterns.BehaviouralDP.Command;

public class RemoteController {
    Command command;

    public RemoteController(Command command) {
        this.command = command;
    }

    void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}
