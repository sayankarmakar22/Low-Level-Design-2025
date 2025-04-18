package Command;

public class TurnOnACRemote implements GadgetCommands{
    AC ac;

    public TurnOnACRemote(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }
}
